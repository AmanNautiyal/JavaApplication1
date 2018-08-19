/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Aman Nautiyal
 */
public class ChatTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
       String str=Br.readLine();
       String tokens[]=str.split("[ ]");
       int p=Integer.parseInt(tokens[0]);
       int q=Integer.parseInt(tokens[1]);
       int l=Integer.parseInt(tokens[2]);
       int r=Integer.parseInt(tokens[3]);
       int xtime[]=new int[r];
       int ytime[]=new int[r];
       Arrays.fill(xtime,0);
       Arrays.fill(ytime,0);
       int max=0;
       for(int i=0;i<p;i++)
       {
           str=Br.readLine();
           tokens=str.split("[ ]");
           int a=Integer.parseInt(tokens[0]);
           int b=Integer.parseInt(tokens[1]);
           for(int j=a;j<=b;j++)
               ytime[j]=1;
           if(max=)
       }
       for(int i=0;i<q;i++)
       {
           str=Br.readLine();
           tokens=str.split("[ ]");
           xtime[i][0]=Integer.parseInt(tokens[0])+l;
           xtime[i][1]=Integer.parseInt(tokens[1])+l;
       }
       int count=0;
       while(true)
       {
        if(xtime[0][0]>ytime[0][1])
            break;
        
       }
    }
    
}
