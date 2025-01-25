public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("987654321", 100000);

        try {
            account.deposit(50000);
            account.withdraw(30000); // Successful withdrawal
            account.withdraw(150000); // Will throw InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}