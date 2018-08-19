/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.net.*;
public class ChatServerTcp {
    ServerSocket s;
    BufferedReader Br;
    public ChatServerTcp() throws IOException {
        Br = new BufferedReader(new InputStreamReader(System.in));
        s = new ServerSocket(1234);
    }
    public void process() throws Exception {
        while (true) {
            System.out.println("Waiting..");
            Socket client = s.accept();
            System.out.println("Connection made.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
            writer.println("Connected to Server.");
            while (true) {
                String clientSay = reader.readLine();
                System.out.println("Client:" + clientSay);
                if (clientSay.equalsIgnoreCase("quit")) {
                    break;
                }
                System.out.print("Server: ");
                String serverSay = Br.readLine();
                if (serverSay.equalsIgnoreCase("quit")) {
                    writer.println("Server Left");
                    client.close();
                    s.close();
                    return;
                }
                writer.println(serverSay);
            }
        }
    }
    public static void main(String args[]) throws Exception {
        ChatServerTcp ob = new ChatServerTcp();
        ob.process();
    }
}
