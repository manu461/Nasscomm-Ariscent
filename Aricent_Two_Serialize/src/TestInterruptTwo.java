/**
 * Created by staLker on 14-06-2017.
 */
public class TestInterruptTwo extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("task");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception Handled..."+e);
        }
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        TestInterruptOne t1 = new TestInterruptOne();
        t1.start();
        t1.interrupt();
    }
}
