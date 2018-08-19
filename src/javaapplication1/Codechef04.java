/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*;
import java.util.*;
/**
 *
 * @author Aman Nautiyal
 */
public class Codechef04 
{
 static int ar[],tr[];
 static void quickSort(int low, int high)
    {
 
        int i=low;
        int j=high;
        int temp;
        int middle=ar[(low+high)/2];
 
        while (i<j)
        {
            while (ar[i]>middle)
            {
                i++;
            }
            while (ar[j]<middle)
            {
                j--;
            }
            if (j>=i)
            {
                temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
                i++;
                j--;
            }
        }
 
 
        if (low<j)
        {
            quickSort(low, j);
        }
        if (i<high)
        {
            quickSort(i, high);
        }
    }
  public static void main(String args[]) throws IOException
  {
   BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
   String str;
   String tokens[];
   int i,t,n,q;
   t=Integer.parseInt(Br.readLine());
   for(;t>0;t--)
   {
     str=Br.readLine();
     tokens=str.split("[ ]+");
     n=Integer.parseInt(tokens[0]);
     q=Integer.parseInt(tokens[1]);
     ar=new int[n];
     tr=new int[n];
     str=Br.readLine();
     tokens=str.split("[ ]+");
     for(i=0;i<n;i++)
        ar[i]=Integer.parseInt(tokens[i]);
     quickSort(0,n-1);
     for(;q>0;q--)
     {
      System.arraycopy(ar,0,tr,0,n);
      int l=Integer.parseInt(Br.readLine());
      int ptr=n;
      if(tr[n-1]>=l)
      {
          System.out.println(n);
          continue;  //all snakelengths greater than query
      }
      for(i=0;i<n;i++)
      {
       if(tr[i]<l)
       {
           ptr=i;break; //finding ptr,the greatest length smaller than query
       }
      }
   if(ptr==(n-1))//ptr is last one,no increment possible
   {
    System.out.println((n-1));
    continue;    //
   }
   int rear=n-1;
   while(true)
   {
    i=rear-ptr;
    if((tr[ptr]+i)<l)
    {
     rear=ptr-1;
     break;
    }
    rear=rear-(l-tr[ptr]);
    tr[ptr]=l;
    ptr++;
   }
   System.out.println((rear+1));
  }
 }
} 
}

