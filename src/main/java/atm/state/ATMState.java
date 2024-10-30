package atm.state;

public interface ATMState {
    void withdraw(int amount);
    void deposit(int amount);
}
