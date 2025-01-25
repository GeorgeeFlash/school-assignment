public class Main {
    public static void main(String[] args) {
        // Create a back account with an initial balance
        BankAccount account = new BankAccount("12345678", 1000000);

        // Perform deposit and withdrawal operations
        account.deposit(500000);
        account.withdraw(300000);
        account.withdraw(1500000); // Will display an insufficient balance message
    }
}