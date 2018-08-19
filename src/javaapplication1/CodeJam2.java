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
public class CodeJam2 {
    static void troubleSort(int l[])
    {
        boolean done=false;
        int temp;
        while(!done)
        {
            done=true;
            for(int i=0;i<l.length-2;i++)
            {
                if(l[i]>l[i+2])
                {
                    done=false;
                    temp=l[i];
                    l[i]=l[i+2];
                    l[i+2]=temp;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(Br.readLine());
        for(int i=1;i<=t;i++)
        {
          int n=Integer.parseInt(Br.readLine());
          String rd=Br.readLine();
          int ar[]=new int[n];
          String tokens[]=rd.split("[ ]+");
          for(int j=0;j<n;j++)
              ar[j]=Integer.parseInt(tokens[j]);
          troubleSort(ar);
          int index=-1;
          for(int j=0;j<ar.length-1;j++)
          {
             if(ar[j]>ar[j+1])
             {
                 index=j;break;
             }
          }
          //for(int x:ar)
            //  System.out.println(x);
          System.out.print("Case #"+i+": ");
          if(index==-1)
              System.out.println("OK");
          else
              System.out.println(index);

        }
    }
    
}
