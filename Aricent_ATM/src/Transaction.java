import java.util.Date;

/**
 * Created by staLker on 09-06-2017.
 */
public class Transaction {
    private double debitAmount;
    private double creditAmount;
    private Date transactionDate;
    private boolean  isTransactionDebit;
    private boolean isTransactionCredit;
    public double getAccountBalance(){
        return 0.0;
    }
    public double calculateBalance(double balance){
        return 0.0;
    }
    public void startTransaction(){
    }
    public void cancelTransaction(){
    }

    public void setTransactionDebit(boolean transactionDebit) {
        isTransactionDebit = transactionDebit;
    }

    public void setTransactionCredit(boolean transactionCredit) {
        isTransactionCredit = transactionCredit;
    }

    public boolean isTransactionDebit() {

        return isTransactionDebit;
    }

    public boolean isTransactionCredit() {
        return isTransactionCredit;
    }
}
