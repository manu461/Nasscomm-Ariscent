import java.util.List;

/**
 * Created by staLker on 09-06-2017.
 */
public class CustomerLab {
    private List<BankCustomer> allCustomer;
    private static CustomerLab customerLab;

    private CustomerLab(){
        //create an account;
        SavingAccount savingAccount1 = new SavingAccount(123456,125);
        CurrentAccount currentAccount1 = new CurrentAccount(467445,320);


        //create ATM card of customer;
        ATMCard atmCard1 = new ATMCard(2232,1217473627,savingAccount1);
        ATMCard atmCard2 = new ATMCard(3546,23253617,currentAccount1);


        //associate it with a bank customer

        BankCustomer customer1 = new BankCustomer("Manu","Varanasi","manu@gmail.com",atmCard1,savingAccount1);
        BankCustomer customer2 = new BankCustomer("Mandy","Manduadih","mandy@gmail.com",atmCard2,currentAccount1);
        allCustomer.add(customer1);
        allCustomer.add(customer2);

    }
    public List<BankCustomer> getAllCustomers(){
        return allCustomer;
    }
    protected static CustomerLab get(){
        if(customerLab == null){
            customerLab = new CustomerLab();
            return customerLab;
        }
        return customerLab;
    }
    public BankCustomer getBankCustomer(long cardID){
        for(BankCustomer bankCustomer : allCustomer){
            if(bankCustomer.getAtmCard().getCardID() == cardID){
                return bankCustomer;
            }
        }
        return null;
    }
    public void addBankCustomer(BankCustomer customer){
        allCustomer.add(customer);
    }

}
