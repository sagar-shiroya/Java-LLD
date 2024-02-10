package Design_Pattern.Observer;

public class StockExchangeClient {
    public static void main(String[] args) {
        Stock MRFStock = new Stock("MRF", 85000);
        Stock SBIStock = new Stock("SBIN", 550);

        Investor investor1 = new Investor("Sagar");
        Investor investor2 = new Investor("Mitali");
        Investor investor3 = new Investor("Aman");

        StockBroker zerodha = new StockBroker("Zerodha");
        StockBroker upstox = new StockBroker("Upstox");

        MRFStock.registerObserver(zerodha);
        SBIStock.registerObserver(zerodha);
        MRFStock.registerObserver(upstox);
        SBIStock.registerObserver(upstox);

        MRFStock.registerObserver(investor1);
        MRFStock.registerObserver(investor2);
        SBIStock.registerObserver(investor3);

        MRFStock.updatePrice(90000);
        System.out.println();
        SBIStock.updatePrice(700);
    }
}
