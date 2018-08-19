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
public class Codechef204
{
 public static void main(String args[]) throws IOException
 {
  BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
  int t=Integer.parseInt(Br.readLine());
  String str,tokens[];
  int n,l,a,b,c,ar[];
  for(;t>0;t--)
  {
   c=0;
   str=Br.readLine();
   tokens=str.split("[ ]+");
   n=Integer.parseInt(tokens[0]);
   l=Integer.parseInt(tokens[0]);
   a=Integer.parseInt(tokens[0]);
   b=Integer.parseInt(tokens[0]);
   ar=new int[n];
   str=Br.readLine();
   tokens=str.split("[ ]+");
   for(int i=0;i<n;i++)
    ar[i]=Integer.parseInt(tokens[i]);
   Arrays.sort(ar);
   
  }
 }  
}
