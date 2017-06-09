
import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by staLker on 06-06-2017.
 */
public class Main {
    public static void main(String[] args) {
        int option;
        System.out.println("Press\n1:Enter new Item\n2:List All Item\n3:To get detail of nth item\n");
        Scanner scanf = new Scanner(System.in);
        option = scanf.nextInt();
        switch (option){
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }


        GPSManager gpsManager = new GPSManager() {
            @Override
            public void setManager() {
               //logic for the GPS manager
            }
        };


    }
}
