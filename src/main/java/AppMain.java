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

        transactionalWithdraw(account, cashMachine, 200);


        System.out.println("---------------------------------");
        System.out.println(account);
        System.out.println(cashMachine);

    }

    private static void transactionalWithdraw(Account account, CashMachine cashMachine, int amount) {
        Account accountBackup = account.copy();
        CashMachine cashMachineBackup = cashMachine.copy();


        try{
            account.withdraw(amount);
            cashMachine.withdraw(amount);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            account.restore(accountBackup);
            cashMachine.restore(cashMachineBackup);
        }
    }
}
