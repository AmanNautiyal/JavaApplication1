

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aman Nautiyal
 */
public class ThreadPriority {

    private static class Tp extends Thread
    {
        int click=0;
        @Override
        public void run() {
            while(true){
            click++;}
        }  
    }
    public static void main(String[] args) {
        Tp lpt=new Tp(),hpt=new Tp();
        lpt.setPriority(1);
        hpt.setPriority(10);
        lpt.start();
        hpt.start();
        try{
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            System.out.println("Interrupted Exception");
        }
        lpt.stop();
        hpt.stop();
        System.out.println("Low="+lpt.click);
        System.out.println("High="+hpt.click);
    }  
}
