import model.DomainException.DomainException;
import model.entities.Account;

public class Main {
    public static void main(String[] args) {

        try{
            Account account = new Account(1, "Client", 500.0, 300.0);

            account.withdraw(400.0);

            System.out.println(account);
        }
        catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }
    }
}