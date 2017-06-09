import java.util.Scanner;

/**
 * Created by staLker on 09-06-2017.
 */
public class Main {
    private static final long insertedCardNumber = 1217473627;
    static BankCustomer presentBankCustomer;
    static boolean isPinCorrect;
    public static void main(String[] args) {


        CustomerLab customerLab = CustomerLab.get();


        System.out.print("" +
                "1:to insert Card\n" +
                "2: to select Transaction\n" +
                "3: to enter Pin\n" +
                "4: to change Pin\n" +
                "5: to withdraw Cash\n" +
                "6: to request Transaction Summary\n" +
                "7: to accept Amount\n");
        int option;
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();
        switch (option){

            case 1:
                presentBankCustomer = BankCustomer.insertCard(insertedCardNumber);
                break;


            case 2:
                System.out.print("C: to credit\n" +
                        "D: to debit");
                String opt = scanner.next();
                presentBankCustomer.selectTransaction(opt);



            case 3:
                System.out.print("Enter 4-Digit Pin");
                isPinCorrect = presentBankCustomer.enterPin(scanner.nextInt());
                break;



            case 4:
                System.out.print("Enter your current pin\n");
                int currentPin = scanner.nextInt();
                System.out.print("Enter your new pin\n");
                int newPin = scanner.nextInt();
                presentBankCustomer.changePin(currentPin,newPin);
                break;


            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
        }

    }
}
