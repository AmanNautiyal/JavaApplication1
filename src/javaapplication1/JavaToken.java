/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*;
/**
 *
 * @author Aman Nautiyal
 */
public class JavaToken {
    
    public static void main(String[] args) throws IOException{
        BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        String str="";
        for(int i=0;i<5;i++)
            str=str+"\n"+Br.readLine();
        str=str+"\n";
        String token[]=str.split("[\r\n]+");
        for(int i=0;i<token.length;i++)
            System.out.println(token[i]);
    }
    
}
