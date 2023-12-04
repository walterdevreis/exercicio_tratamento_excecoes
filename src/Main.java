import model.DomainException.BusinessException;
import model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            account.withdraw(sc.nextDouble());

            System.out.println(account);
        }
        catch (BusinessException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}