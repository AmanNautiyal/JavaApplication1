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
public class Video {
    	String videoName;
	boolean checkout;
	int rating;
	Video(String name)
	{
		videoName=name;
                checkout=false;
                rating=0;
	}
	String getName()
	{
	  return videoName;
	}
	void doCheckout()
	{
            checkout=true;
	}
	void doReturn()
	{
            checkout=false;
	}
	void receiveRating(int rating)
	{
            this.rating=rating;
	}
	boolean getCheckout()
	{
            return checkout;
	}
    
}
