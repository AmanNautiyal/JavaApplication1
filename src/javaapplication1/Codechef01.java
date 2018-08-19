import java.util.Scanner;
public class Codechef01 
{
 public static void main(String args[])
 {   
  Scanner S=new Scanner(System.in);     
  int t,x,l;
  String str;
  t=S.nextInt();
  for(;t>0;t--)
  {
   x=0;
   l=S.nextInt();
   str=S.next(); 
   if(str.length()!=l || l>500||l<0)
   {
    System.out.println("Invalid");
    continue;
   }
  for(int i=0;i<l;i++)
  {
    if(str.charAt(i)=='.')
       continue;  //wait
    else if(x==0 && str.charAt(i)=='H')
           x=1;  //wait for tail
       
    else if(x==1 && str.charAt(i)=='T')
       x=0;  //wait for head or end
    else if(x==0 && str.charAt(i)=='T')
    {
       x=2;
       break;    //tail after tail
    }
    else if(x==1 && str.charAt(i)=='H')
    {
     x=3;
     break;
    }  //head after head
  }
  if(x==1 || x==2 ||x==3)
       System.out.println("Invalid");  //head after head or tail after tail or waiting for tail
  else
    System.out.println("Valid");  //wait for end finishes
 }   
}
}
