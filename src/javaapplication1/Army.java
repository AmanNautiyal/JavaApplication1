/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Aman Nautiyal
 */
public class Army {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    BufferedReader Br= new BufferedReader(new InputStreamReader(System.in)); 
    int n=Integer.parseInt(Br.readLine());
    String str=Br.readLine();
    String tokens[]=str.split("[ ]");
    int di[]=new int[n-1];
    for(int i=0;i<n-1;i++)
        di[i]=Integer.parseInt(tokens[i]);
    str=Br.readLine();
    tokens=str.split("[ ]");
    int a=Integer.parseInt(tokens[0]),b=Integer.parseInt(tokens[1]);
    a--;
    b-=2;
    int years=0;
    for(int i=a;i<=b;i++)
        years+=di[i];
    System.out.println(years);
    } 
}
