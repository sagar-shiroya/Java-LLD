package Design_Pattern.Abstract_Factory;

public class CircleFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
