package Design_Pattern.Adapter;

public class ICICIBankApiAdapter implements BankApiAdapter{
    IciciBank icicibank;

    public ICICIBankApiAdapter() {
        this.icicibank = new IciciBank();
    }

    @Override
    public Double fetchBalance(String username, String password) {
        Double balance = 0.0;
        try {
            String token = icicibank.getToken(username, password);
            balance = icicibank.getBalance(token);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return balance;
    }

    @Override
    public PhonePeStatus doTransaction(String fromUsername, String fromPassword, String toUsername, Long amount){
        PhonePeStatus transactionStatus = PhonePeStatus.INVALID;
        try {
            String token = icicibank.getToken(fromUsername, fromPassword);
            Double doubleValue = amount.doubleValue();
            ICICIBankStatus status = icicibank.transaction(token,toUsername, doubleValue);

            switch (status){
                case DONE:
                    transactionStatus = PhonePeStatus.ONE;
                    break;
                case FAILED:
                    transactionStatus = PhonePeStatus.TWO;
                    break;
                case IN_PROGRESS:
                    transactionStatus = PhonePeStatus.THREE;
                    break;
                default:
                    throw new InvalidTransactionStatusException("Invalid Transaction Status");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return transactionStatus;

    }
}
