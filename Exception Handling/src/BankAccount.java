public class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available balance: " + balance);
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount + "\nNew Balance: " + balance);
    }
}
