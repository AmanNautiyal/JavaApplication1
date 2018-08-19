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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
     BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
     int n=Integer.parseInt(Br.readLine());
     for(int i=1;i<=n;i++)
     {
       for(int j=1;j<=i;j++)
           System.out.print(j+"\t");
       System.out.println();
     }
     }
    }
    

