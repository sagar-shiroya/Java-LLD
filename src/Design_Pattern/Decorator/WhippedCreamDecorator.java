package Design_Pattern.Decorator;

public class WhippedCreamDecorator implements Coffee{
    private Coffee coffee;

    public WhippedCreamDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", with Whipped Cream";
    }

    @Override
    public Double getCost() {
        return coffee.getCost() + 0.9;
    }
}
