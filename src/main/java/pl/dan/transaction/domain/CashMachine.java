package pl.dan.transaction.domain;

/**
 * Created by Daniel_D'AGE on 06.02.2019.
 */
public class CashMachine {

    private int money;

    public CashMachine(int initialAmount){

        this.money = initialAmount;
    }

    public void withdraw(int amount){

        if (this.money - amount<0){
            throw new IllegalMonitorStateException("Za mało gotówki w bankomacie!!! Mykaj do innego!");
        }

        this.money -= amount;
    }

    @Override
    public String toString() {
        return "CashMachine{" +
                "money=" + money +
                '}';
    }

    // metody biznesowe do kopiowania i przywrócenia naszego stanu
    public CashMachine copy(){
         return new CashMachine(this.money);
    }

    public void restore (CashMachine machine){
        this.money = machine.money;
    }

}
