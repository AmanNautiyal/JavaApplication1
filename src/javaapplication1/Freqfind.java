/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import java.util.HashMap;
/**
 *
 * @author Aman Nautiyal
 */
public class Freqfind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      HashMap<Integer,Integer> mp=new HashMap<>();
      int s=sc.nextInt();
      int max=0,maxf=0;
      while(s!=0)
      {
       if(mp.containsKey(s))
       {
           int temp=mp.get(s);
           mp.replace(s, temp+1);
           if(temp+1>maxf)
           {
               maxf=temp+1;
               max=s;
           }
       }
       else
       {
        mp.put(s, 1);
       }
       s=sc.nextInt();
      }
      System.out.println("Max="+max+"\nFrequency="+maxf);
    }
    
}
