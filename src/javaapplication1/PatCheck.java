/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
import java.util.regex.*;
/**
 *
 * @author Aman Nautiyal
 */
public class PatCheck
{
 public static  void main(String args[])throws Exception
 {
  Scanner S=new Scanner(System.in);
  String str=S.nextLine();
 // String pattern="([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
 //String pattern="([A-Z]([a-z]*[ ]|[.]))*[A-Z][a-z]+";
 String pattern="[1-9][0-9]{5}";
 System.out.println(str.matches(pattern));
 
 // System.out.println(str.matches(pattern+"\\."+pattern+"\\."+pattern+"\\."+pattern));
 /*int ar[]=new int[10];
  for(int i:ar)
      ar[i]=0;*/
  
 }
}
