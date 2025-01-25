// Class representing a back account with encapsulated fields
public class BankAccount {
    private String accountNumber; // Private fields ensure restricted access
    private double balance;

    // Constructor to initialize the account
    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Public method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + "\nNew Balance: " + balance);
    }

    // Public method to withdraw money, ensuring the balance doesn't go below zero
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + "\nNew Balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Current Balance: " + balance);
        }
    }
}
