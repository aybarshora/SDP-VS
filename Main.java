import FactoryPatternAssignment.Shape;
import FactoryPatternAssignment.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.createShape("circle");
        circle.draw();

        Shape rectangle = factory.createShape("rectangle");
        rectangle.draw();
    }
}