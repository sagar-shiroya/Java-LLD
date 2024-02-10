package Design_Pattern.Observer;

public class StockBroker implements Observer{
    private String stockBrokerName;

    public StockBroker(String stockBrokerName) {
        this.stockBrokerName = stockBrokerName;
    }

    public String getStockBrokerName() {
        return stockBrokerName;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Updated stock price of " + stockName + " on " +getStockBrokerName()+": "+ price);
    }
}
