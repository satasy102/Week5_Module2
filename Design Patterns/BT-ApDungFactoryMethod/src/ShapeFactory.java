import java.util.Scanner;

public class ShapeFactory {
    private static final Scanner sc = new Scanner(System.in);

    ShapeFactory() {
    }

    public static Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE -> {
                System.out.println("Enter your Radius: ");
                double radius = sc.nextDouble();
                return new Circle(radius);
            }
            case RECTANGLE -> {
                System.out.println("Enter your Width:");
                double width = sc.nextDouble();
                System.out.println("Enter your Length:");
                double length = sc.nextDouble();

                return new Rectangle(width, length);
            }
            case SQUARE -> {
                System.out.println("Enter your Side: ");
                double side = sc.nextDouble();
                return new Square(side);
            }

            default -> throw new IllegalStateException("This Shape is unsupported");
        }
    }


}
