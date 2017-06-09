/**
 * Created by staLker on 09-06-2017.
 */
public class Account {
    private int accountNumber;
    private double balance;
    private Transaction transaction;
    public void calculateInterest(){

    }
    public void updateAccount(){

    }
    public void verifyWithdrawAmount(){

    }

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
