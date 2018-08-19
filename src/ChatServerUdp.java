
import java.io.*;
import java.net.*;
public class ChatServerUdp {
    BufferedReader Br;
    DatagramSocket ds;
    final int S_PORT = 1234;
    final int C_PORT = 12345;
    byte buffer[];
    final int BUFSIZE = 1024;
    public ChatServerUdp() throws IOException {
        Br = new BufferedReader(new InputStreamReader(System.in));
        ds = new DatagramSocket(S_PORT);
        buffer = new byte[BUFSIZE];
    }
    public void process() throws Exception {
        DatagramPacket sp, rp = new DatagramPacket(buffer, BUFSIZE);
        while (true) {
            System.out.println("Waiting..");
            
            ds.receive(rp);
            System.out.println("Connection made.");
            String clientName = new String(rp.getData(), 0, rp.getLength());
            buffer = ("Connected to Server").getBytes();
            sp = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), C_PORT);
            ds.send(sp);
            while (true) {
                ds.receive(rp);
                String clientSay = new String(rp.getData(), 0, rp.getLength());
                System.out.println(clientName + ":" + clientSay);
                if (clientSay.equalsIgnoreCase("quit")) {
                    break;
                }
                System.out.print("Server: ");
                String serverSay = Br.readLine();
                if (serverSay.equalsIgnoreCase("quit")) {
                    buffer = ("Connected to Server").getBytes();
                    sp = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), C_PORT);
                    ds.send(sp);
                    return;
                }
                buffer = serverSay.getBytes();
                sp = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), C_PORT);
                ds.send(sp);
            }
        }
    }
    public static void main(String args[]) throws Exception {
        ChatServerUdp ob = new ChatServerUdp();
        ob.process();
    }
}
