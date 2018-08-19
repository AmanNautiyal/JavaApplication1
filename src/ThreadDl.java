/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aman Nautiyal
 */
public class ThreadDl {
    private static class A {
        synchronized void xyz(B b) {
            String currentThread=Thread.currentThread().getName();
            System.out.println(currentThread + " entered A.xyz");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("Interrupted Exception");
            }
            System.out.println(currentThread + " calling B.last");
            b.last();
        }
        synchronized void last()
        {
            System.out.println(Thread.currentThread().getName()+" inside A.last");
        }
    }
    private static class B {
        synchronized void abc(A a) {
            String currentThread=Thread.currentThread().getName();
            System.out.println(currentThread + " entered B.xyz");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("Interrupted Exception");
            }
            System.out.println(currentThread + " calling A.last");
            a.last();
        }
        synchronized void last()
        {
            System.out.println(Thread.currentThread().getName()+" inside B.last");
        }
    }
    private static class Deadlock extends Thread{
        A a;
        B b;
        Deadlock(A a,B b)
        {
            this.a=a;this.b=b;
        }
        public void run()
        {
            b.abc(a);//Get lock on b on thread 2
        }
    }
    public static void main(String[] args) {

        A a=new A();B b=new B();
        Thread.currentThread().setName("Thread 1");
        Deadlock t=new Deadlock(a,b);
        t.setName("Thread2");
         t.start();
        a.xyz(b);//Get lock on a on thread 1       
    }
}
