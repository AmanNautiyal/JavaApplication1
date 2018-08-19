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
public class recurse {

    /**
     * @param args the command line arguments
     */
    void recurse(int n)      
  {
     if(n==1)
     {  System.out.print(n);
    } 
    else
    {
      System.out.println(n);
     recurse(n-1);
    }
  }
    public static void main(String[] args) {
        recurse obj=new recurse();
        obj.recurse(12);
     // TODO code application logic here
    }
    
}
