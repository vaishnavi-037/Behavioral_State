package atm;

import atm.context.ATM;

public class Application {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.withdraw(500);
        atm.withdraw(200);
        atm.withdraw(400);  // we reach $0 in atm after this operation
        atm.withdraw(100);
        atm.deposit(200);
        atm.withdraw(100);
    }
}
