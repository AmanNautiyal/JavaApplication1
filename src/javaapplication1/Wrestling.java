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
public class Wrestling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
      BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
      long x,n=Long.parseLong(Br.readLine());
      long suma=0,sumb=0,maxa=0,maxb=0;
      for(long i=0;i<n;i++)
      {
        x=Long.parseLong(Br.readLine());
        if(x>0)
        {
            suma+=x;
            if(maxa<Math.abs(x))
                maxa=Math.abs(x);
        }
        else
        {
           sumb+=Math.abs(x);
            if(maxb<Math.abs(x))
                maxb=Math.abs(x);  
        }
      }
      if(suma>sumb)
          System.out.println("first");
      else if(sumb>suma)
          System.out.println("second");
      else
      {
          if(maxb>maxa)
              System.out.println("second");
          else
            System.out.println("first");  
      }
    }
    
}
