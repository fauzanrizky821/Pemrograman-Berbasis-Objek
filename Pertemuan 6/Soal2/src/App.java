import com.Circle;
import com.Rectangle;
import com.Shape;
import com.Square;

public class App {
    public static void main(String[] args) throws Exception {
        // Test Shape class
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);

        // Test Circle class
        Circle circle1 = new Circle();
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());

        Circle circle2 = new Circle("red", true, 5.0);
        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());

        // Test Rectangle class
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle("yellow", true, 4.0, 6.0);
        System.out.println(rectangle2);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

        // Test Square class
        Square square1 = new Square(4.0);
        System.out.println(square1);
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());

        // Test Square class
        Square square2 = new Square("Yellow", true, 5.0);
        System.out.println(square1);
        System.out.println("Area: " + square2.getArea());
        System.out.println("Perimeter: " + square2.getPerimeter());
    }
}
