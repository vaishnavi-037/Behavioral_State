package atm.context;

import atm.state.ATMState;
import atm.state.Working;

public class ATM implements ATMState {
    private int cashAvailable;
    private ATMState currentState;
    public ATM() {
        currentState = new Working(this);  // Set initial state
        cashAvailable = 1000;  // Initial money in ATM
    }
    public int getCashAvailable() {
        return cashAvailable;
    }
    public void setCashAvailable(int cashAvailable) {
        this.cashAvailable = cashAvailable;
    }

    public void setState(ATMState state) {
        currentState = state;
    }
    public void withdraw(int amount) {
        currentState.withdraw(amount);
    }
    public void deposit(int amount) {
        currentState.deposit(amount);
    }
}
