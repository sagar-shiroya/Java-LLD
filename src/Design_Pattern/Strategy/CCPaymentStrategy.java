package Design_Pattern.Strategy;

public class CCPaymentStrategy implements PaymentStrategy{
    private String ccVendorName;
    private CardType cardType;
    private String cardNumber;
    private String expiryDate;
    private int cvvNumber;

    public CCPaymentStrategy(String ccVendorName, CardType cardType, String cardNumber, String expiryDate, int cvvNumber) {
        this.ccVendorName = ccVendorName;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvvNumber = cvvNumber;
    }

    public String getCcVendorName() {
        return ccVendorName;
    }

    public CardType getCardType() {
        return cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getCvvNumber() {
        return cvvNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Amount Rs." + amount + " paid. Card No.:" + getCardNumber());
    }
}
