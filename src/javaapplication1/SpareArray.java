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
public class SpareArray
{
 BufferedReader Br=new BufferedReader(new InputStreamReader(System.in)); 
 public static void main(String[] args) throws IOException
 {
     BufferedReader Br=new BufferedReader(new InputStreamReader(System.in)); 
     int x=Integer.parseInt(Br.readLine());
     String list[]=new String[x];
     for(int i=0;i<x;i++)
      list[i]=Br.readLine();
     int y=Integer.parseInt(Br.readLine());
     String quer[]=new String[y];
     for(int i=0;i<y;i++)
      quer[i]=Br.readLine();
     int c;
     for(int i=0;i<y;i++)
     {
      c=0;
      for(int j=0;j<x;j++)
      {
       if(quer[i].equals(list[j]))
           c++;
      }
      System.out.println(c);
     }
         
 }
}
