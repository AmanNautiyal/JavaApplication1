/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Aman Nautiyal
 */
public class decrypter1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String tokens[],str=sc.nextLine();
        int temp=0,i=0;
        while(!str.equalsIgnoreCase("end"))
        {
         tokens=str.split("[.]");
         for(String st: tokens)
         {
             if(st.equals(""))
                 continue;
          temp+=Integer.parseInt(st);
           i++;
           if(i==3)
           {
               i=0;
               System.out.println(temp);
               temp=0;
           }
         }
         str=sc.nextLine();
        }
    }
}
