/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaproj;

/**
 *
 * @author Aman Nautiyal
 */
public class VideoStore {
    Video[] store;
    VideoStore()
     {
         store=new Video[0];
     }
 void addVideo(String name)
 {
  Video[] temp=new Video[store.length+1];
  for(int i=0;i<store.length;i++)
      temp[i]=store[i];
  temp[store.length]=new Video(name);
  store=temp;
 }
 void doCheckout(String name)
 {
     int i;
     for(i=0;i<store.length;i++)
     {
         if(store[i].getName().equalsIgnoreCase(name))
             break;
     }
     store[i].doCheckout();
 }
 void doReturn(String name)
 {
     int i;
     for(i=0;i<store.length;i++)
     {
         if(store[i].getName().equalsIgnoreCase(name))
             break;
     }
     store[i].doReturn();
 }
 void receiveRating(String name,int rating)
 {
     int i;
     for(i=0;i<store.length;i++)
     {
         if(store[i].getName().equalsIgnoreCase(name))
             break;
     }
     store[i].receiveRating(rating);
 }
 void listInventory()
 {
     for(int i=0;i<store.length;i++)
     {
         System.out.println(store[i].getName()+"\t\t|\t"+store[i].getCheckout()+"\t\t|\t"+store[i].rating);
     }
 }
}
