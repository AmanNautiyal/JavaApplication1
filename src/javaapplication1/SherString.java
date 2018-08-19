/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
import java.math.*;
/**
 *
 * @author Aman Nautiyal
 */
public class SherString
{
  static String isValid(String s)
  {
        char[] ar;
      ar = new char[26];
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++)
            freq[((int)s.charAt(i))-97]++;
        int x=0,y=0;
        int u1=-1,u2=-1;
        for(int i=0;i<26;i++)
        {
         System.out.println((char)(97+i)+"="+freq[i]);
        }
        for(int i=0;i<26;i++)
        {
         if(freq[i]==0)
             continue;
         if(u1==-1)
         {u1=freq[i];x++;}
         else if(freq[i]!=u1 && u2==-1)
         {u2=freq[i];y++;}
         else if(freq[i]==u1)
             x++;
         else if(freq[i]==u2)
             y++;
         if(u2!=-1 && freq[i]!=u1 && freq[i]!=u2)
             return "NO";
        }
        System.out.println("u1="+u1+"\tu2="+u2+"\tx="+x+"\ty="+y);
        if(u2==-1||((x==1 || y==1)&& Math.abs(u1-u2)==1)||(u1==1&&x==1 ||u2==1&&y==1))
            return "YES";
        return "NO";
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }   
}
