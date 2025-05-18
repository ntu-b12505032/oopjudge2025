/**
 * Represents a circle shape.
 * Uses diameter as the input length.
 */
public class Circle extends Shape {

    /**
     * Constructs a Circle with the specified diameter.
     * 
     * @param length the diameter of the circle
     */
    public Circle(double length) {
        super(length);
    }

    /**
     * Sets the diameter of the circle.
     * 
     * @param length the new diameter
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates the area of the circle.
     * 
     * @return the area
     */
    @Override
    public double getArea() {
        double radius = length / 2;
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the perimeter (circumference) of the circle.
     * 
     * @return the perimeter
     */
    @Override
    public double getPerimeter() {
        return Math.PI * length;
    }
}
