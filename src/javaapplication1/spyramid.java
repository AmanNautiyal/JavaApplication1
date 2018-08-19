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
public class spyramid
{

    /**
     * @param args the command line arguments
     */
    void create(int x)
    {
      for(int i=1;i<=x;i++)
      {
       for(int j=1;j<=x-i;j++)
         System.out.print(" ");
       for(int k=1;k<=(2*i)-1;k++)
       {
         if(k%2==0)
         {
             System.out.print(" ");
             continue;
         }
         System.out.print("*");
       }
       System.out.println();
      }  
    }
    public static void main(String[] args) {
        // TODO code application logic here
        spyramid obj =new spyramid();
        obj.create(10);
    }
    
}
