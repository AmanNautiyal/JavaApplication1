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
public class Codechef201
{
 
 public static void main(String args[]) throws IOException
 {
  BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
  String str;
  String tokens[];
  int t=Integer.parseInt(Br.readLine());
  int m,n;
  for(;t>0;t--)
  {
    str=Br.readLine();
    tokens=str.split("[ ]+");
    n=Integer.parseInt(tokens[0]);
    m=Integer.parseInt(tokens[1]);
    for(;m>0;m--)
      str=Br.readLine();
    if(((n-(m*2))%2)!=0)
     System.out.println("no");
    else
        System.out.println("yes");
  }
 }
}
