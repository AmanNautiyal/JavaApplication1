/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.net.Socket;
public class ChatClientTcp {
    void runner() throws Exception {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter name:");
        String name = Br.readLine();
        Socket s = new Socket("localhost", 1234);
        BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter writer = new PrintWriter(s.getOutputStream(), true);
        System.out.println("Server:" + reader.readLine());
        while (true) {
            System.out.print(name + ":");
            String clientSay = Br.readLine();
            writer.println(clientSay);
            if (clientSay.equalsIgnoreCase("quit")) {
                s.close();
                break;
            }
            System.out.println("Server:" + reader.readLine());
        }
    }
    public static void main(String args[]) throws Exception {
        ChatClientTcp ob = new ChatClientTcp();
        ob.runner();
    }
}
