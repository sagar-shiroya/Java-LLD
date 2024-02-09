package Design_Pattern.Decorator;

public class StarBucks {
    public static void main(String[] args) {
        System.out.println("-------------Coffee 1------------");
        Coffee coffee = new WhippedCreamDecorator(new PlainCoffee());
        System.out.println("Price: "+coffee.getCost());
        System.out.println("Coffee Description: "+coffee.getDescription());

        System.out.println("-------------Coffee 2------------");
        Coffee coffee2 = new WhippedCreamDecorator(new SugarDecorator(new MilkDecorator(new PlainCoffee())));
        System.out.println("Price: "+coffee2.getCost());
        System.out.println("Coffee Description: "+coffee2.getDescription());

    }
}
