package Design_Pattern.Strategy;

public class WalletPaymentStrategy implements PaymentStrategy{
    private String wallerNumber;
    private String walletProvider;

    public WalletPaymentStrategy(String wallerNumber, String walletProvider) {
        this.wallerNumber = wallerNumber;
        this.walletProvider = walletProvider;
    }

    public String getWalletProvider() {
        return walletProvider;
    }

    public String getWallerNumber() {
        return wallerNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " from " + getWalletProvider() + " wallet.(Wallet ID:" +getWallerNumber() + ")");
    }
}
