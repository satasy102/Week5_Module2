public class Rectangle implements Shape{
    private double width = 1.0;
    private double length = 1.0;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    @Override
    public void draw() {
        System.out.println("A Rectangle with width "
                + width
                + " and length "
                + length);
    }
}
