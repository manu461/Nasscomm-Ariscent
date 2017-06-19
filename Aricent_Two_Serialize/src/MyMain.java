/**
 * Created by staLker on 14-06-2017.
 */
public class MyMain {
    public static void main(String[] args) {
        final Customer c = new Customer();
        new Thread(){
            public void run(){
                c.withdraw(15000);
            }
        }.start();
        new Thread(){
            public void run(){c.deposit(100000);}
        }.start();
//-1->when wait() method is called the current running thread stops executing and releases the lock on
//    thread object.
//-2->When the deposit method is called on the second thread the second method acquires lock and goes \
//    for execution.
//-3->Once the execution completes the second thread notifies the first thread using
//    the notify() method, therefore first thread starts executing.
    }
}
//-#->notifyAll() method sends notification to all the threads informing that the current thread
//     has finished execution.

//-#->All JAVA application requires some sort of multithreading internally, Inter-Thread communication
//     is required in all levels in java programs,that is why wait(),notify(),notifyAll() are part of
//      object class.