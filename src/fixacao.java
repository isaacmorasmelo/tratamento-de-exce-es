import entities.Account;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class fixacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account Account1 = new Account();

        System.out.println("Enter account data");

        try {
            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double ibalance = sc.nextDouble();

            System.out.println("Withdraw limit: ");
            double wLimit = sc.nextDouble();

            Account account = new Account(number,holder,ibalance,wLimit);

            System.out.println();

            System.out.println("Enter amount for withdraw: ");
            Account1.withdrawn(sc.nextDouble());

            System.out.println("new balance: " + Account1.getBalance());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Withdraw error: The amount exceeds withdraw limit");
        }
        catch(Exception e){
            System.out.println("Not enough balance");
        }
    }


}
