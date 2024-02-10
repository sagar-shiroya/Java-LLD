package Design_Pattern.Strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    private String companyName;

    public ShoppingCart(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkOut(double amount){
        this.paymentStrategy.pay(amount);
    }
}
