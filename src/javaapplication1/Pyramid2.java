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
public class Pyramid2 
{
  int n;
  void create(int s,int c)
  {
   int i,j,k;
   for(i=1;i<=n;i++)
   {
     for(j=1;j<=(n*s);j++)
         System.out.print(" ");
     for(j=1;j<=c;j++)
     {
      for(k=1;k<=n-i;k++)
       System.out.print(" ");
      for(k=1;k<=(2*i)-1;k++)
        System.out.print("*");
      for(k=1;k<=n-i+1;k++)
         System.out.print(" ");
     }
     System.out.println();
   }
  }
  void pyr()
  {
   for(int i=1;i<=n;i++)
     create((n-i),i);
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Pyramid2 obj=new Pyramid2();
      obj.n=4;
      obj.pyr();
      // TODO code application logic here
    }
    
}
