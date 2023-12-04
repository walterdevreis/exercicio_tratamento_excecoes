import model.entities.Account;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(1, "Client", 1000.0, 500.0);

        System.out.println(account);
    }
}