package Design_Pattern.Decorator;

public class MilkDecorator implements Coffee{
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", with milk";
    }

    @Override
    public Double getCost() {
        return coffee.getCost() + 0.5;
    }
}
