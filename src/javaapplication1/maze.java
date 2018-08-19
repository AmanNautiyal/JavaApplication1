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
/*
            
*/
public class maze
{
  int mz[][]={{0,1,0,1,1},{1,0,1,0,0},{1,0,0,1,1},{1,1,0,1,1},
      {1,1,1,0,0},{1,0,1,0,0}};
  
  int i=0,j=0,c=1;
  int sl[]=new int[50],s;
  maze()
  {
   sl[0]=0;
   sl[1]=0;
   s=2;
  }
  void perf()
  {
   try
   {
    if(i==5)
    {
        display();
        return;
    }
    if(look())
    {
     sl[s++]=i;
     sl[s++]=j;
     if(c<5)
     {
       c++; perf();
     }
     else if(c==5)
     {
      backtrack();
      perf();
     }
    }
   }
   catch(Exception e)
   {
    System.out.println("No possible path");
   }
  }
  boolean look()
  {
   try
   {
    if( c==1 && mz[i][j+1]==0)
    {
     j++;System.out.println("Flag 1)");
     return true;   
    }
    else if(c==2 &&mz[i+1][j+1]==0)
    {   
     i++;j++;
     return true;
    }
    else if(c==3 &&mz[i+1][j]==0)
    {
        i++;return true;
    }
    else if(c==4 &&mz[i+1][j-1]==0)
    {
        i++;j--;return true;
    }
    else if(c==5&&mz[i][j-1]==0)
    {
        j--;return true;
    }
    return false;
    
   }
   
   catch(Exception  e)
   {
    return false;
   }
  }
  void backtrack()
  {
   if(sl[s-1]==i && sl[s-2]==j-1)
     c=2;
    else if(sl[s-1]==i-1 && sl[s-2]==j-1)
     c=3;
    else if(sl[s-1]==i-1 && sl[s-2]==j)
     c=4;
    else if(sl[s-1]==i-1 && sl[s-2]==j+1)
     c=5;
    else if(sl[s-1]==i && sl[s-2]==j+1)
     c=1;

  }
  void display()
  {
   for(int i=0;i<s;i++)
    System.out.println(sl[i]+" "+sl[++i]);
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        maze obj=new maze();
        obj.perf();
    }
    
}
