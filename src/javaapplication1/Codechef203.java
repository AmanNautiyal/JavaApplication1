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
public class Codechef203
{
 int heights[],steps;
 int tarr[][];
 int o,n;
 void perf() throws IOException
 {
  BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
  int t=Integer.parseInt(Br.readLine());
  String str,tokens[];
  for(;t>0;t--)
  {
    n=Integer.parseInt(Br.readLine());
    heights=new int[n];
    tarr=new int[n][n];
    str=Br.readLine();
    tokens=str.split("[ ]+");
    for(int i=0;i<n;i++)
    {
     heights[i]=Integer.parseInt(tokens[i]);
     for(int j=0;j<n;j++)
       tarr[j][i]=heights[i];
    }
    o=-1;
    for(int i=1;i<n;i++)
    {  
        templeAt(i);
        if(o==0)
            break;
    }
    System.out.println(o);
  }
 }
 void templeAt(int x) throws IOException
 {
    // System.out.println("for "+x);
  steps=0;
  int b= x>=(n/2)?(n-x-1):x;
  if(b>tarr[x][x]-1)
      b=tarr[x][x]-1;
  else
  {
      steps+=(tarr[x][x]-b-1);
      tarr[x][x]=b+1;
  }
   for(int i=x+b+1;i<n;i++)
   {
    steps+=tarr[x][i];
    tarr[x][i]=0;
   }
   if(steps>o && o!=-1)
       return;
   
   for(int i=0;i<x-b;i++)
    {
     steps+=tarr[x][i];
     tarr[x][i]=0;
    }
    if(steps>o && o!=-1)
       return;
  int i=b,j=0;
  while(i>0 &&b>0)
  {
   j++;
   //System.out.println("i="+i+"\tj="+j+"\tb="+b);
   if(tarr[x][x-i]<j || tarr[x][x+i]<j)
   {
     // System.out.println("Flag1");
    for(int y=b;y<i;y--)
    {
     steps+=tarr[x][x-y];
     tarr[x][x-y]=0;
     steps+=tarr[x][x+y];
     tarr[x][x+y]=0;
     if(steps>o && o!=-1)
       return;
    }
    b=i;
    steps+=(tarr[x][x-i]-1);
    steps+=(tarr[x][x+i]-1);
    tarr[x][x-i]=1;
    tarr[x][x+i]=1;
    //System.out.println("b="+b);
    if(b>tarr[x][x]-1)
      b=tarr[x][x]-1;
    else
    {
      steps+=(tarr[x][x]-b-1);
      tarr[x][x]=b+1;
    }
    if(steps>o && o!=-1)
       return;
    j=0;
   }
   else
   {
    //System.out.println("Flag2");
    steps+=(tarr[x][x-i]-j);
    tarr[x][x-i]=j;
    steps+=(tarr[x][x+i]-j);
    tarr[x][x+i]=j;
     //System.out.println("steps="+steps+"\to="+o);
    if(steps>o && o!=-1)
       return;
   }
   if(x-b-1>=0 && x+b+1<n)
    {
       steps+=(tarr[x][x-b-1]);
       steps+=(tarr[x][x+b+1]);
       tarr[x][x-b-1]=0;
       tarr[x][x+b+1]=0;
    }
   //for(int u=0;u<n;u++)
    //System.out.print("\t"+tarr[x][u]);
   //System.out.println("\nsteps="+steps);
   i--;
  }
  steps+=(tarr[x][x]-b-1);
      tarr[x][x]=b+1;
  if(o==-1)
      o=steps;
  else if(steps<o)
      o=steps;
 }
 void test() throws IOException
 {
    n=5;o=-1;
    heights=new int[5];
    tarr=new int[5][5];
    heights[0]=1;heights[1]=1;heights[2]=1;heights[3]=4;heights[4]=5;
        tarr[4][0]=1;tarr[4][1]=1;tarr[4][2]=1;tarr[4][3]=4;tarr[4][4]=5;
    templeAt(4);
    System.out.println(o);
 }
 public static void main(String args[]) throws IOException
 {
  Codechef203 ob=new Codechef203();
  ob.test();
 }
}
