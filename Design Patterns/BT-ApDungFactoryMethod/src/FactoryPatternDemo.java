public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();
    }
}
