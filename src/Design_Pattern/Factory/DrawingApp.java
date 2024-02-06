package Design_Pattern.Factory;

public class DrawingApp {
    public static void main(String[] args) {
        Shape s1 = ShapeFactory.createShape("CIRCLE");
        s1.draw();

        Shape s2 = ShapeFactory.createShape("RecTangle");
        s2.draw();

//        Below shape type is not there so it will throw an exception
//        Shape s3 = ShapeFactory.createShape("Hexagon");
//        s3.draw();


    }
}
