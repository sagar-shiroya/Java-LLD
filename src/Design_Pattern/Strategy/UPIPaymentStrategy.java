package Design_Pattern.Strategy;

public class UPIPaymentStrategy implements PaymentStrategy{
    private String upiID;

    public UPIPaymentStrategy(String upiID) {
        this.upiID = upiID;
    }

    public String getUpiID() {
        return upiID;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Amount " + amount + " paid from UPI ID:" + getUpiID());
    }
}
