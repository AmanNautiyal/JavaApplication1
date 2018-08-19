
import java.net.*;
import java.util.Scanner;
public class DNSlookup {
    private static void printAddress(InetAddress adr){
        System.out.println("Host name:"+adr.getHostName());
        System.out.println("Host ip:"+adr.getHostAddress());
    }
    public static void main(String[] args) throws UnknownHostException {
        InetAddress local=InetAddress.getLocalHost();
        Scanner sc=new Scanner(System.in);
        System.out.println("Local address");
        printAddress(local);
        System.out.println("Enter any website address:");
        String query=sc.nextLine();
        InetAddress qAdr[]=InetAddress.getAllByName(query);
        for(InetAddress ad:qAdr){
            printAddress(ad);
        }
    }
}
