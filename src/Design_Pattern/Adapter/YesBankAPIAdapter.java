package Design_Pattern.Adapter;

public class YesBankAPIAdapter implements BankApiAdapter{
    YesBank yesbank;

    public YesBankAPIAdapter() {
        this.yesbank = new YesBank();
    }

    @Override
    public Double fetchBalance(String username, String password) {
        Double balance;
        try {
            balance = Double.valueOf(yesbank.getBalance(username, password));
        } catch (InvalidCredentialException e) {
            throw new RuntimeException(e);
        }
        return balance * 1000;
    }

    @Override
    public PhonePeStatus doTransaction(String fromUsername, String fromPassword, String toUsername, Long amount) {
        PhonePeStatus transactionStatus = PhonePeStatus.INVALID;
        YesBankStatus status = yesbank.sendMoney(fromUsername, toUsername, fromPassword, amount.doubleValue());

        switch(status){
        case Y:
            transactionStatus = PhonePeStatus.ONE;
        case N:
            transactionStatus = PhonePeStatus.TWO;
        case I:
            transactionStatus = PhonePeStatus.THREE;
        }

        return transactionStatus;
    }
}
