package Design_Pattern.Observer;

public class Investor implements Observer{
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String stockName, double price) {
        // SendEmailNotification();
        System.out.println("Investor " + this.getName() + " is notified. Stock " + stockName +" price updated to: "+price);
    }
}
