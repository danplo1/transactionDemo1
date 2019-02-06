import pl.dan.transaction.domain.Account;
import pl.dan.transaction.domain.CashMachine;

/**
 * Created by Daniel_D'AGE on 06.02.2019.
 */
public class AppMain {

    public static void main(String[] args) {

        Account account = new Account(200);
        CashMachine cashMachine = new CashMachine(100);

        System.out.println(account);
        System.out.println(cashMachine);

        try{
            account.withdraw(200);
            cashMachine.withdraw(200);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("---------------------------------");
        System.out.println(account);
        System.out.println(cashMachine);

    }
}
