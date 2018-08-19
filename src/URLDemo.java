/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aman Nautiyal
 */
import java.io.IOException;
import java.net.*;
public class URLDemo {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url=new URL("http://www.gbpec.ac.in/");
        System.out.println("Protocol:"+url.getProtocol());
        System.out.println("Port:"+url.getPort());
        System.out.println("Host:"+url.getHost());
        System.out.println("File:"+url.getFile());
        System.out.println("External Form:"+url.getFile());
    }
}
