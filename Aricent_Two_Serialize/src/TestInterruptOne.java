/**
 * Created by staLker on 14-06-2017.
 */
public class TestInterruptOne extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("task");
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException("Thread Interrupted..."+e);
        }

    }

    public static void main(String[] args) {
        TestInterruptOne t1 = new TestInterruptOne();
        t1.start();
        try {
            t1.interrupt();
        }catch (Exception e){
            System.out.println("Exception handled..."+e);
        }

    }
}
