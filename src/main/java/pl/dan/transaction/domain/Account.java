package pl.dan.transaction.domain;

/**
 * Created by Daniel_D'AGE on 06.02.2019.
 */
public class Account {

    private int balance;

    public Account (int initialBalance){

        this.balance = initialBalance;
    }

    public void withdraw(int amount){
        this.balance -= amount;

    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }

    public Account copy(){

        return new Account(this.balance);
    }

    public void restore (Account account){
        this.balance = account.balance;
    }




}
