// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message); // Pass the error message to the Exception superclass
    }
}
