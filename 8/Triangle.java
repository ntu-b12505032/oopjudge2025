/**
 * Represents an equilateral triangle shape.
 * The length represents the side length of the triangle.
 */
public class Triangle extends Shape {
    /**
     * Constructs a Triangle with the given side length.
     * @param length the side length of the triangle
     */
    public Triangle(double length) {
        super(length);
    }

    /**
     * Sets the side length of the triangle.
     * @param length the new side length
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates and returns the area of the triangle.
     * Uses the formula: (√3 / 4) * side²
     * @return the area of the triangle rounded to two decimal places
     */
    @Override
    public double getArea() {
        return Math.round((Math.sqrt(3) / 4 * length * length) * 100.0) / 100.0;
    }

    /**
     * Calculates and returns the perimeter of the triangle.
     * Uses the formula: 3 * side
     * @return the perimeter of the triangle rounded to two decimal places
     */
    @Override
    public double getPerimeter() {
        return Math.round((3 * length) * 100.0) / 100.0;
    }
}
