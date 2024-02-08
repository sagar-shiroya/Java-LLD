package Design_Pattern.Adapter;

public class InvalidTransactionStatusException extends Exception{
    public InvalidTransactionStatusException(String message) {
        super(message);
    }
}
