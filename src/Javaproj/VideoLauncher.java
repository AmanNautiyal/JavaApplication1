/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaproj;

import java.util.Scanner;

/**
 *
 * @author Aman Nautiyal
 */
public class VideoLauncher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Sc=new Scanner(System.in);
       int ch;
       String name;
       boolean con=true;
       VideoStore vs=new VideoStore();
       while(con)
       {
        System.out.println("MAIN MENU");
        System.out.println("=========");
        System.out.println("1.Add Videos:");
        System.out.println("2.Check Out Video:");
        System.out.println("3.Return Video:");
        System.out.println("4.Receive Rating:");
        System.out.println("5.List Inventory:");
        System.out.println("6.Exit:");
        System.out.print("Enter Your Choice (1..6):");
        ch=Sc.nextInt();
        Sc.nextLine();
        switch(ch)
        {
            case 1:
                System.out.print("Enter the name of video you want to add: ");
                name=Sc.nextLine();
                vs.addVideo(name);
                System.out.println("Video \""+name+"\" added successfully");
                break;
            case 2:
               System.out.print("Enter the name of video you want to check out: ");
                name=Sc.nextLine();
                vs.doCheckout(name);
                System.out.println("Video \""+name+"\" checked out successfully");
                break; 
            case 3:
               System.out.print("Enter the name of video you want to Return: ");
                name=Sc.nextLine();
                vs.doReturn(name);
                System.out.println("Video \""+name+"\" added successfully");
                break; 
            case 4:
               System.out.print("Enter the name of video you want to rate: ");
                name=Sc.nextLine();
               System.out.print("Enter the rating for this video: ");
               int rt=Sc.nextInt();
                vs.doCheckout(name);
                System.out.println("Rating \""+rt+"\" has been mapped to the Video \""+name+"\" successfully");
                break; 
            case 5:
                System.out.println("--------------------------------------------------------");
                System.out.println("Video Name\t|\tCheckout Status |\t Rating");
                vs.listInventory();
                System.out.println("--------------------------------------------------------");
                break;
            case 6:
                System.out.println("Exiting...!! Thanks for using the application.");
                con=false;
                break;
        }
       }
    }
    
}
