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
public class Codechef03 
{
 class Snake
 {
  public long x1,y1,x2,y2,hv;
  Snake(long a1,long b1,long a2,long b2)
  {
   if(a1==a2)
      hv=2;
   else
      hv=1;
   if(hv==1)
   {
     x1=a1<=a2?a1:a2;
     x2=a1>=a2?a1:a2;
     y1=b1;y2=b2;
   }
   else
   {
    y1=b1<=b2?b1:b2;
    y2=b1>=b2?b1:b2;
    x1=1;x2=a2;
   }
  }
 }
 void perf() throws IOException
 {
  BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
  Snake s1,s2;
  String str;
  String tokens[];
  long t=Long.parseLong(Br.readLine());
  for(;t>0;t--)
  {
   str=Br.readLine();
   tokens=str.split("[ ]+");
   s1=new Snake(Long.parseLong(tokens[0]),Long.parseLong(tokens[1]),Long.parseLong(tokens[2]),Long.parseLong(tokens[3]));
   str=Br.readLine();
   tokens=str.split("[ ]+");
   s2=new Snake(Long.parseLong(tokens[0]),Long.parseLong(tokens[1]),Long.parseLong(tokens[2]),Long.parseLong(tokens[3]));  
   if(s1.hv==1 && s2.hv==1)  //both horizontal
   {
    if(s1.y1 !=s2.y1)
        System.out.println("no");   // different y axes
    else if((s1.x1<s2.x1 && s2.x1<=s1.x2)||(s2.x1<s1.x1 && s1.x1<=s2.x2))
         System.out.println("yes"); //common vertices
    else
        System.out.println("no");  //no common vertex
   }
   else if(s1.hv==2 && s2.hv==2)  //both vertical
   {
    if(s1.x1!=s2.x1)
        System.out.println("no"); //different x axes
    else if((s1.y1<s2.y1 && s2.y1<=s1.y2)||(s2.y1<s1.y1 && s1.y1<=s2.y2))
        System.out.println("yes"); //common vertices
    else
        System.out.println("no");//no common vertex
   }
   else if((s1.hv==1 && s2.hv==2)||(s1.hv==2 && s2.hv==1)) // first horizontal second vertical
   {
    if((s1.x1==s2.x1 && s1.y1==s2.y1)||(s1.x1==s2.x2 && s1.y1==s2.y2)||(s1.x2==s2.x1 && s1.y2==s2.y1)||(s1.x2==s2.x2 && s1.y2==s2.y2))
     System.out.println("yes");
    else
     System.out.println("no");
   }
  }
 }
 public static void main(String args[]) throws IOException
 {
     Codechef03 ob=new Codechef03();
     ob.perf();
 }
}
