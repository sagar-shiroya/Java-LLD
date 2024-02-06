package Design_Pattern.Abstract_Factory;

public class DrawingApp {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();
        ShapeFactory squareFactory = new SquareFactory();


        Shape circle = circleFactory.createShape();
        Shape rectangle = rectangleFactory.createShape();
        Shape square = squareFactory.createShape();

        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
