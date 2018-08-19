
import java.io.*;
import java.net.*;
public class ChatClientUdp {
    BufferedReader Br;
    DatagramSocket ds;
    final int S_PORT = 1234;
    final int C_PORT = 12345;
    byte buffer[];
    final int BUFSIZE = 1024;
   public ChatClientUdp() throws IOException {
        Br = new BufferedReader(new InputStreamReader(System.in));
        ds = new DatagramSocket(C_PORT);
        buffer = new byte[BUFSIZE];
    }
    void runner() throws Exception {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter name:");
        String name = Br.readLine();
        DatagramPacket sp, rp = new DatagramPacket(buffer, BUFSIZE);
        buffer = name.getBytes();
        sp = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), S_PORT);
        ds.send(sp);
        ds.receive(rp);
        System.out.println(new String(rp.getData(), 0, rp.getLength()));
        while (true) {
            System.out.print(name + ":");
            String clientSay = Br.readLine();
            buffer = clientSay.getBytes();
            sp = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), S_PORT);
            ds.send(sp);
            if (clientSay.equalsIgnoreCase("quit")) {
                break;
            }
            ds.receive(rp);
            System.out.println("Server:" + new String(rp.getData(), 0, rp.getLength()));
        }
    }
    public static void main(String args[]) throws Exception {
        ChatClientUdp ob = new ChatClientUdp();
        ob.runner();
    }
}
