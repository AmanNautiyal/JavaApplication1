

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aman Nautiyal
 */
public class ThreadCom {
    private static class Box {
       int val;
        boolean valset = false;
        synchronized int get() {
            if (!valset) {
                try {
                    wait();//Consumer waits
                } catch (InterruptedException ex) {
                    System.out.println("Interrupted Exception");
                }
            }
            System.out.println("Consumer got " + val);
            valset = false;
            notify();//Producer notified
            return val;
        }
        synchronized void put(int x) {
            if (valset) {
                try {
                    wait();//Producer waits
                } catch (InterruptedException ex) {
                    System.out.println("Interrupted Exception");
                }
            }
            val = x;
            valset = true;
            System.out.println("Producer put " + val);
            notify();//Notify Consumer
        }
    }
    private static class Consumer extends Thread {
        Box target;
        public Consumer(Box t) {
            target = t;
        }
        public void run() {
            while (true) {
                target.get();
            }
        }
    }
    private static class Producer extends Thread {
       Box target;
        public Producer(Box t) {
            target = t;
        }
        public void run() {
            int i = 0;
            while (true) {
                target.put(i);
                i++;
            }
        }
    }
    
    public static void main(String[] args) {
        Box box = new Box();
        Producer p = new Producer(box);
        Consumer c = new Consumer(box);
        p.start();
        c.start();
        try {
            Thread.sleep(0, 100);//args-long ms,int ns
        } catch (InterruptedException ex) {
            System.out.println("Interrupted Exception");
        }
        p.stop();
        c.stop();
    }
}
