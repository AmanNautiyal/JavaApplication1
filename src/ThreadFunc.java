/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aman Nautiyal
 */
public class ThreadFunc {
    private static class ThreadA extends Thread {
        @Override
        public void run() {
            System.out.println("Entering thread A");
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread A :" + i);
                if (i == 1) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        System.out.println("Interrupted Exception");
                    }
                    System.out.println("Thread A:Exit by stop()");
                    this.stop();
                }
            }
        }
    }
    private static class ThreadB extends Thread {
        @Override
        public void run() {
            System.out.println("Entering thread B");
            System.out.println("Thread B yielding");
            yield();
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    System.out.println("Interrupted Exception");
                }
                System.out.println("Thread B :" + i);
            }
            System.out.println("Exiting Thread B");
        }
    }
    private static class ThreadC extends Thread {
        @Override
        public void run() {
            System.out.println("Entering thread C");
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    System.out.println("Interrupted Exception");
                }
                System.out.println("Thread C :" + i);
            }
            System.out.println("Exiting Thread C");
        }
    }
    public static void main(String args[]) throws InterruptedException {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        ThreadC t3 = new ThreadC();
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(5000);
    }
}
