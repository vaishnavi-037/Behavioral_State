package atm.state;

import atm.context.ATM;

public class Working implements ATMState{

    private ATM atm;
    public Working(ATM atm) {
        this.atm = atm;
    }
    @Override
    public void withdraw(int amount) {
        int cashAvailable = atm.getCashAvailable();
        if (amount > cashAvailable) {
            /*
                ATM has insufficient cash, dispense
                whatever partial amount the ATM has.
            */
            amount = cashAvailable;
            System.out.print("Partial amount ");
        }
        System.out.println("$" + amount + " has been dispersed.");
        int newCashAvailable = cashAvailable - amount;
        atm.setCashAvailable(newCashAvailable);
        if (newCashAvailable == 0) {
            // Transition to the OutOfCash ConcreteState
            atm.setState(new OutOfCash(atm));
        }
    }

    @Override
    public void deposit(int amount) {
        System.out.println("$" + amount + " has been deposited.");
        atm.setCashAvailable(atm.getCashAvailable() + amount);
    }
}
