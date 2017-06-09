/**
 * Created by staLker on 09-06-2017.
 */
public class ATMCard {
    private int pin;
    private long cardID;
    private Account account;
    public void setPin(int pin){
        this.pin = pin;
    }
    public int getPin(){
        return this.pin;
    }
    public Account getAccount(){
        return this.account;
    }

    public ATMCard(int pin, long cardID, Account account) {
        this.pin = pin;
        this.cardID = cardID;
        this.account = account;
    }

    public long getCardID() {
        return cardID;
    }

    public void setCardID(long cardID) {
        this.cardID = cardID;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
