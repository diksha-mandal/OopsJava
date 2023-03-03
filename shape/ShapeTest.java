package shape;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle perimeter: " + circle.perimeter());
        System.out.println("Circle area: " + circle.area());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}