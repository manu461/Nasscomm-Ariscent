/**
 * Created by staLker on 14-06-2017.
 */
public class Customer {
    int amount;
    public void withdraw(int amount){
        System.out.println("Going to withdraw...");
        if(this.amount<amount){
            System.out.println("Balance Low, Waiting for Deposite...");
            try {
                wait();
            } catch (InterruptedException e) {

            }
            this.amount-=amount;
            System.out.println("withdraw Complete...New Balance is : "+this.amount);
        }
    }
    synchronized   void deposit(int amount){
        System.out.println("Going to deposite...");
        this.amount+=amount;
        System.out.println("Deposit complete...Current amount is: "+this.amount);
        notify();
    }


}
//afetr the start method is invoked run method is invoked automatically the contrl switches to rum method, there is a synchronize block with this inside sunchronize blovck, this refers to the current refrence variable.


//instead of syncronization of whole method which causes major issues we can synchronize part of method using synchronization block.
