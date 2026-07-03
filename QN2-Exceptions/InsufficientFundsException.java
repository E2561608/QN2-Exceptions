// Custom Checked Exception
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Method implementing the custom exception
class Wallet {
    private double balance = 50000.0;

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Error: Insufficient balance. Remaining: UGX " + balance);
        }
        balance -= amount;
    }
}