/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*;
public class CodeJam1{
    public static void main(String[] args) throws IOException {
        BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(Br.readLine());
        for(int i=1;i<=t;i++)
        {
            String inp,tokens[],p;
            int d,initial_damage,power,up,swaps,low,damages[];
            swaps=0;
            inp=Br.readLine();
            tokens=inp.split("[ ]");
            p=tokens[1];
            d=Integer.parseInt(tokens[0]);
            damages=new int[p.length()];
            char p_ar[]=p.toCharArray();
           /* for(char c:p_ar)
                System.out.println(c);*/
            initial_damage=0;
            power=1;
            for(int j=0;j<p_ar.length;j++)
            {
                if(p_ar[j]=='C')
                    power*=2;
                else
                    initial_damage+=power;
                damages[j]=power;
            }
            if(initial_damage<=d )
            {
                System.out.println("Case #"+i+": 0");
                continue;
            }
           if(p_ar[p_ar.length-1]=='C')
               up=p_ar.length-2;
           else
               up=p_ar.length-1;
           int j;
           for(j=up-1;j>=0;j--)
               if(p_ar[j]=='C')
                   break;
           if(j<0)
           {
               System.out.println("Case #"+i+": IMPOSSIBLE");
               continue;
           }
           low=j;
          /* System.out.println("low="+low);
           System.out.println("up="+up);
           for(int x:damages)
               System.out.println(x);*/
           while(low>=0 && initial_damage>d)
           {
               int seq_dam=damages[low];
               //System.out.println(seq_dam);
               int x=(initial_damage-d)/(seq_dam/2);
               //System.out.println(x);
               int swap_pos;
               if(x<=(up-low))
                   swap_pos=x;
               else
                   swap_pos=(up-low);
               for(int k=low;k<up;k++)
                   damages[k]=seq_dam/2;
               p_ar[low]='S';
               p_ar[low+swap_pos]='C';
               up=low+swap_pos;
               swaps+=swap_pos;
               initial_damage-=((seq_dam/2)*swap_pos);
               for(j=low-1;j>=0;j--){
               if(p_ar[j]=='C')
                   break;
               }
               low=j;
           }
           if(initial_damage>d)
               System.out.println("Case #"+i+": IMPOSSIBLE");
           else
               System.out.println("Case #"+i+": "+swaps);
        }
    }
    
}
