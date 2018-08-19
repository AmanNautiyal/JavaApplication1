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
public class Javarr
{
 public static void main(String args[]) throws IOException
 {
   BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
   String str=Br.readLine();  
   String arr[]=str.split("[ ]+");
   int brr[]=new int[arr.length];
   for(int i=0;i<arr.length;i++)
       brr[i]=Integer.parseInt(arr[i]);
   for(int i=0;i<arr.length;i++)
       System.out.println(brr[i]);
 }
}
