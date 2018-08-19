/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
/**
 *
 * @author Aman Nautiyal
 */
public class Pyramid 
{
  void create()
  {
    int i,j;
    for(i=1;i<=4;i++)
    {
      for(j=1;j<=(7-i);j++)
         System.out.print(" ");
      for(j=1;j<=(2*i)-1;j++)
         System.out.print("*");
      System.out.println();
    }
    for(i=1;i<4;i++)
    {
     for(j=1;j<=(4-i);j++)
         System.out.print(" ");
     for(j=1;j<=(2*i)-1;j++)
         System.out.print("*");
     for(j=1;j<=(2*(4-i))-1;j++)
         System.out.print(" ");
     for(j=1;j<=(2*i)-1;j++)
         System.out.print("*");
     System.out.println();
    }
    for(i=1;i<=13;i++)
     System.out.print("*");
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Pyramid obj= new Pyramid();
        obj.create();
    }
    
}
