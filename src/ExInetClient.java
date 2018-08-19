
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class ExInetClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Ip address:");
        String ip=sc.nextLine();
        byte adr[]=new byte[4];
        String tokens[]=ip.split("[.]");
        for(int i=0;i<tokens.length;i++)
            adr[i]=Byte.parseByte(tokens[i]);
        System.out.print("Enter port number:");
        int x=sc.nextInt();
        InetAddress serverAdr=InetAddress.getByAddress(adr);
        Socket receiver=new Socket(serverAdr,x);
        BufferedReader reader = new BufferedReader(new InputStreamReader(receiver.getInputStream()));
        System.out.println("Message received:"+reader.readLine());
        receiver.close();
    }   
}
