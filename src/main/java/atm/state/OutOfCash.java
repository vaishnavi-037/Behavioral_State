package atm.state;

import atm.context.ATM;

public class OutOfCash implements ATMState{
    private ATM atm;  // Store the context to reference its methods/fields
    public OutOfCash(ATM atm) {
        this.atm = atm;
    }
    public void withdraw(int amount) {
        System.out.println("ATM is out of cash!");
    }
    public void deposit(int amount) {
        System.out.println("$" + amount + " has been deposited.");

        atm.setCashAvailable(atm.getCashAvailable() + amount);
        // Transition to the Working ConcreteState
        atm.setState(new Working(atm));
    }
}
