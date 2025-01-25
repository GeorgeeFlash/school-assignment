// Bank account class with exception handling
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
    }

    // Withdraw money with exception handling
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Current balance: $" + balance);
        }

        balance -= amount;
        System.out.println("Withdrawn: $" + amount + ", New Balance: $" + balance);
    }
}
