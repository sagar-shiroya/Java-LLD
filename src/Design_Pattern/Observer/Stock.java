package Design_Pattern.Observer;

import java.util.List;
import java.util.ArrayList;

public class Stock implements Subject{
    private String stockName;
    private double price;
    private List<Observer> observerList;

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        this.observerList = new ArrayList<>();
    }

    public void updatePrice(double price) {
        this.price = price;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observerList){
            observer.update(stockName, price);
        }
    }
}
