/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Aman Nautiyal
 */
public class decrypter2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        while(s!=0)
        {
            s-=762;
            System.out.print((char)s);
            s=sc.nextInt();
        }
    }
    
}
