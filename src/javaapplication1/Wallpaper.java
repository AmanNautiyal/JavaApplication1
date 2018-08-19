/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Aman Nautiyal
 */
public class Wallpaper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(Br.readLine());
        int r[][]=new int[n][3];
        for(int i=0;i<n;i++)
        {
         String str=Br.readLine();
         String tokens[]=str.split("[ ]");
         r[i][0]=Integer.parseInt(tokens[0]);
         r[i][1]=Integer.parseInt(tokens[1]);
         r[i][2]=Integer.parseInt(tokens[2]);
        }
        int m=Integer.parseInt(Br.readLine());
        int w[][]=new int[m][3];
        for(int i=0;i<m;i++)
        {
         String str=Br.readLine();
         String tokens[]=str.split("[ ]");
         w[i][0]=Integer.parseInt(tokens[0]);
         w[i][1]=Integer.parseInt(tokens[1]);
         w[i][2]=Integer.parseInt(tokens[2]);
        }
        for(int i=0;i<n;i++)
        {
         int t=r[i][0]*r[i][1]*r[i][2];
         int pos=i;
         for(int j=0;j<n;j++)
         {
           if(r[j][0]*r[j][1]*r[j][2]>t)
           {
             t=r[j][0]*r[j][1]*r[j][2];
             pos=j;
           }
         }
         if(pos!=i)
         {
             int t1=r[i][0],t2=r[i][1],t3=r[i][2];
             r[i][0]=r[pos][0];
             r[i][1]=r[pos][1];
             r[i][2]=r[pos][2];
             r[pos][0]=t1;
             r[pos][1]=t2;
             r[pos][2]=t3;
         }
        }
        long total=0;
        for(int i=0;i<n;i++)
        {
            int l=r[i][0]+r[i][1];
            int h=r[i][2];
            int cost=0;
            double tc;
            for(int j=0;j<m;j++)
            {
               double pt=Math.ceil((double)l/(double)w[j][1]);
               tc=pt*h;
               tc=tc/w[j][0];
               tc=Math.ceil(tc)*w[j][2];
               if(tc<cost || j==0)
                cost=(int)tc;
            }
            total+=cost;
        }
      System.out.println(total);  
    }
    
}
