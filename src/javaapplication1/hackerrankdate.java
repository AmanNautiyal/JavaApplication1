/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
import java.text.DateFormatSymbols;
/**
 *
 * @author Aman Nautiyal
 */
public class hackerrankdate
{
 public static void main(String args[])
 {
  DateFormatSymbols dfs =new DateFormatSymbols(Locale.US);
  String weekday[]=dfs.getWeekdays();
  Calendar cal=new GregorianCalendar();
  cal.set(2017,4,12);
  System.out.println(weekday[cal.get(Calendar.DAY_OF_WEEK)]);
  
  
 }
}
