package Design_Pattern.Decorator;

public class SugarDecorator implements Coffee{
    private Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", with sugar";
    }

    @Override
    public Double getCost() {
        return coffee.getCost() + 0.4;
    }
}
