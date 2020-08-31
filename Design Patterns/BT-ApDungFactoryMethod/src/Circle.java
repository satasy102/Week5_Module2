public class Circle implements Shape{
    private double radius = 1.0;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("A Circle with radius: "+radius);
    }
}
