/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;

/**
 *
 * @author Aman Nautiyal
 */
public class jrsttoken
{
 public static void main(String args[]) throws Exception
 {
  Scanner S=new Scanner(System.in);
  String s=S.nextLine();
  System.out.println("Flag");
  s=s.trim();
  String delims;
     delims = "[ .,?!'_@]+";
  String tokens[]=s.split(delims);
  System.out.println(tokens.length);
  for (String token : tokens)
     System.out.println(token);
 }
}
