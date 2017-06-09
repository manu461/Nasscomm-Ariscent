import com.sun.jndi.cosnaming.IiopUrl;

import java.util.Scanner;

/**
 * Created by staLker on 09-06-2017.
 */
public class BankCustomer {
    private String customerName;
    private String address;
    private String eMail;
    private ATMCard atmCard;
    private Account account;
    public static BankCustomer insertCard(long cardID){
        CustomerLab customerLab = CustomerLab.get();
        return customerLab.getBankCustomer(cardID);
    }


    public void selectTransaction(String option){
//        Scanner scanner = new Scanner(System.in);//
//        double amount;
        switch (option){
            case "C":
                System.out.print("Enter the amount to be debited\n");
//                amount = scanner.nextDouble();
                this.getAccount().getTransaction().setTransactionDebit(true);
                this.getAccount().getTransaction().setTransactionCredit(false);
                break;
            case "D":
                System.out.print("Enter the amount to be credited\n");
//                amount = scanner.nextDouble();
                this.getAccount().getTransaction().setTransactionCredit(true);
                this.getAccount().getTransaction().setTransactionDebit(false);
                break;
            default:
                System.out.print("Incorrect button pressed\n");
                break;
        }



    }
    public boolean enterPin(int pin){
        if(this.getAtmCard().getPin() == pin){
            System.out.println("Pin Accepted");
            return true;
        }
        else {
            System.out.println("Wrong Pin");
            return false;
        }


    }
    public void changePin(int currentPin,int newPin){
        if(this.getAtmCard().getPin()==currentPin){
            this.getAtmCard().setPin(newPin);
        }
        else {
            System.out.print("You have entered incorrect current PIN\n");
        }

    }
    public void withdrawCash(){

    }
    public void requestTransactionSummary(){

    }
    public void acceptAmount(){

    }

    public BankCustomer(String customerName, String address, String eMail, ATMCard atmCard, Account account) {
        this.customerName = customerName;
        this.address = address;
        this.eMail = eMail;
        this.atmCard = atmCard;
        this.account = account;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String geteMail() {
        return eMail;
    }

    public ATMCard getAtmCard() {
        return atmCard;
    }

    public Account getAccount() {
        return account;
    }
}
