/**
 * Represents a circle shape using diameter as length.
 * Provides implementation for area and perimeter calculation.
 */
public class Circle extends Shape {

    /**
     * Constructs a Circle with given diameter.
     * 
     * @param length the diameter of the circle
     */
    public Circle(double length) {
        super(length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        double radius = length / 2;
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * length;
    }
}
