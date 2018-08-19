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
public class Codechef202
{
 public static void main(String args[]) throws IOException
 {
  BufferedReader Br =new BufferedReader(new InputStreamReader(System.in));
  int t=Integer.parseInt(Br.readLine());
  int r,c,x;
  boolean v;
  String str1,str2;
  char c1,c2;
  for(;t>0;t--)
  {
   r=Integer.parseInt(Br.readLine());
   str1=Br.readLine();
   str2=Br.readLine();
   v=true;
   c=-2;
   for (int i = 0; i<r; i++)
   {
       
    c1=str1.charAt(i);
    c2=str2.charAt(i);
    if(c1=='.' && c2=='.')
    {
     if(c==0||c==1||c==-1)
      c=2;
    }
    else if(c1=='.' && c2=='#')
    {
      if(c==-1||c==-2)
        c=1;
      else if(c==2 || c==0)
      {
       v=false;break;
      }
    }
    else if(c1=='#' && c2=='.')
    {
      if(c==-1||c==-2)
        c=0;
      else if(c==2 || c==1)
      {
       v=false;break;
      }
    }
    else if(c1=='#' && c2=='#')
    {
      if(c==2)
      {
       v=false;break;
      }
      else if(c==-2)
          c=-1;
      else if(c==1)
          c=0;
      else if(c==0)
          c=1;
    }
   }
   if(v)
       System.out.println("yes");
   else
       System.out.println("no");
  }
 }
}
