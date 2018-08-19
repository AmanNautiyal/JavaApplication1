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
 **/
public class recmax {
     int ar[]=new int[50];
     int s,m;
     void input()throws IOException
     {
      BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter size-");
      s=Integer.parseInt(Br.readLine());
      System.out.println("Enter elements into the array-");
      for(int i=0;i<s;i++)
        ar[i]=Integer.parseInt(Br.readLine());
      m=ar[0];
     }
     int max(int x)
     {
      if(x==s)
        return m;
      else if(ar[x]>m)
        m=ar[x];
      return max(x+1);
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        recmax obj=new recmax();
        obj.input();
        System.out.println("Max value="+obj.max(0));
    }
    
}
