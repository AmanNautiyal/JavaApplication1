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
public class AlgoCrush 
{
    public static void main(String[] args) throws IOException
    {
      BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
      String str=Br.readLine();
      String tokens[]=str.split("[ ]+");
      int n=Integer.parseInt(tokens[0]);
      int m=Integer.parseInt(tokens[1]);
      long ar[]=new long[n+1];
      int a,b;
      long in;
      for(int i=0;i<n+1;i++)
          ar[i]=0;
      long max=0;
      for(int i=1;i<=m;i++)
      {
       str=Br.readLine();
       tokens=str.split("[ ]+");
       a=Integer.parseInt(tokens[0]);
       b=Integer.parseInt(tokens[1]);
       in=Long.parseLong(tokens[2]);
       ar[a]+=in;
       if(b!=n)
           ar[b+1]-=in;
      }
      for(int i=1;i<=n;i++)
      {
       ar[i]+=ar[i-1];
       if(ar[i]>max)
           max=ar[i];
      }
      System.out.println(max);
      
    }
}
