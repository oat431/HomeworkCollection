public class BankAccount {
    private float balance = 0.0f;

    public BankAccount(float initial) {
        if (initial > 0.0f) {
            balance = initial;
        }
    }

    public void deposit(float amount) {
        if (amount > 0.0f) {
            balance += amount;
        }
    }

    public float withdraw(float amount) {
        if (balance > amount) {
            balance -= amount;
            return amount;
        } else {
            float tmp = balance;
            balance = 0.0f;
            return tmp;
        }
    }

    public void displayBalance() {
        System.out.println("\tBalance : $" + balance);
    }
}