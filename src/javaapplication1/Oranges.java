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
public class Oranges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
       String str=Br.readLine();
       String tokens[]=str.split("[ ]");
       int n=Integer.parseInt(tokens[0]);
       int b=Integer.parseInt(tokens[1]);
       int x,d=Integer.parseInt(tokens[2]);
       int waste=0,ans=0;
       str=Br.readLine();
       tokens=str.split("[ ]");
       for(String st: tokens)
       {
           x=Integer.parseInt(st);
           if(x>b)
               continue;
           waste+=x;
           if(waste>d)
           {  
               ans++;
              waste=0;
           }    
       }
       System.out.println(ans);
    }
    
}
