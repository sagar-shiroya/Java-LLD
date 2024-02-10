package Design_Pattern.Strategy;

public class AmazonShoppingCart {
    public static void main(String[] args) {
        PaymentStrategy sagarAmexCC = new CCPaymentStrategy("Amex",CardType.VISA,"1234-5678-9012","12/31",123);
        PaymentStrategy mitaliSbiCC = new CCPaymentStrategy("Amex", CardType.MASTERCARD,"5678-9012-4567","5/34",678);
        PaymentStrategy sagarUPI = new UPIPaymentStrategy("sagar.shiroya@icici");
        PaymentStrategy sagarAmazonWallet = new WalletPaymentStrategy("9099557975","Amazon");
        PaymentStrategy sagarPaytmWallet = new WalletPaymentStrategy("9087654321","PayTM");

        ShoppingCart cart = new ShoppingCart("Amazon IN");

        cart.setPaymentStrategy(sagarUPI);
        cart.checkOut(500); // Amount 500.0 paid from UPI ID:sagar.shiroya@icici

        cart.setPaymentStrategy(sagarAmexCC);
        cart.checkOut(2000); // Amount Rs.2000.0 paid. Card No.:1234-5678-9012

        cart.setPaymentStrategy(sagarPaytmWallet);
        cart.checkOut(650); // Paid Rs.650.0 from PayTM wallet.(Wallet ID:9087654321)

    }
}
