
import java.io.*;
import java.net.*;
public class ExInetServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ser = new ServerSocket(132);
        InetAddress adr=InetAddress.getLocalHost();
        System.out.print("Ip address of this machine:");
        byte ip[]=adr.getAddress();
        for(int i=0;i<ip.length;i++){
            if(i==ip.length-1)
            System.out.print(ip[i]);
            else
             System.out.print(ip[i]+".");
        }
        System.out.println("\nPort:"+ser.getLocalPort());
        System.out.println("Waiting for client...");
        Socket client = ser.accept();
        PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
        String message="Hello World";
        writer.println(message);
        System.out.println("Message sent");
        client.close();
        ser.close();
    }
}
