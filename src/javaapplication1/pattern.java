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
public class pattern
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0;i<=7;i++)
        {
         for(int j=0;j<=7;j++)
         {
          if((i+j)%2==0)
          System.out.print("X ");
          else
              System.out.print("O ");
         }
         System.out.println();    
        }
    }
    
}
