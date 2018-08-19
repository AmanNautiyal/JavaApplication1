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

public class Bidding {

    /**
     * @param args the command line arguments
     */
    String ar[]={"Aman","Shubham","Melkani","Attila","Gaurav"};
    int random(int n)
    {
      int x= (int) (1000*( Math.random()));
      for(int i=n;i>0;i--)
      {
       if(x%i==0)
         return i;
      }
     return -1;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Bidding obj=new Bidding();
        System.out.println(obj.random(10));
    }
    
}
