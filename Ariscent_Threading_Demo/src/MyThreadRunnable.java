/**
 * Created by staLker on 13-06-2017.
 */
public class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Started:::"+Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread Stopped:::"+Thread.currentThread().getName());
    }
}
