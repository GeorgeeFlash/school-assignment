public class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + "\nNew Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + "\nNew Balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Current Balance: " + balance);
        }
    }
}
