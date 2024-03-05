import entities.Account;
import entities.exception.bException;

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
        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Initial balance: ");
        double ibalance = sc.nextDouble();
        System.out.println("Withdraw limit: ");
        double wLimit = sc.nextDouble();

        Account account = new Account(number, holder, ibalance, wLimit);

        System.out.println();

        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();
        account.withdrawn(amount);
        System.out.println("new balance: " + account.getBalance());
    }
}
