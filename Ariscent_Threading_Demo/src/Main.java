/**
 * Created by staLker on 13-06-2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyThreadRunnable(),"t1");
        Thread t2 = new Thread(new MyThreadRunnable(),"t2");
        Thread t3 = new Thread(new MyThreadRunnable(),"t3");
//----->whenever join() method is current thread kills itself and gives other threads chance to get executed.<-----//
        t1.start();
        try {
            t1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
   //---->synchronization is a technique to control the flow of a multi-threaded application to some extend<----//


    }
}
