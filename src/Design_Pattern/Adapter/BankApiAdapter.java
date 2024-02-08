package Design_Pattern.Adapter;

public interface BankApiAdapter {
    public Double fetchBalance(String username, String password);
    public PhonePeStatus doTransaction(String fromUsername, String fromPassword, String toUsername, Long amount) throws InvalidTransactionStatusException;
}
