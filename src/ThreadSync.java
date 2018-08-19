

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aman Nautiyal
 */
public class ThreadSync {
    private static class CallMe {
        void call(String msg) {
            System.out.print("[" + msg);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("Interrupted Exception");
            }
            System.out.println("]");
        }
    }
    private static class Caller implements Runnable {
        String message;
        CallMe target;
        Thread t;
        public Caller(String message, CallMe target) {
            this.message = message;
            this.target = target;
            t = new Thread(this);
            t.start();
        }
        @Override
        public void run() {
            synchronized(target){
            target.call(message);
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        CallMe targ = new CallMe();
        Caller ob1 = new Caller("Hello", targ);
        Caller ob2 = new Caller("World", targ);
        try {
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException ex) {
            System.out.println("Interrupted Exception");
        }
    }
}
