package Design_Pattern.Abstract_Factory;

public class RectangleFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
