package Design_Pattern.Factory;

public class ShapeFactory {
    public static Shape createShape(String shapeType){
//        1. If new shape comes in future then need to create new file of that shape.
//        2. Add one more if else condition in Factory method for that shape type.
//        Note: This if else will be violating OCP.
        if("circle".equalsIgnoreCase(shapeType)) return new Circle();
        else if("rectangle".equalsIgnoreCase(shapeType)) return new Rectangle();
        else if("square".equalsIgnoreCase(shapeType)) return new Square();
        else throw new IllegalArgumentException("Invalid Shape Type");
    }
}
