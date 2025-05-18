/**
 * Represents a square shape.
 * The length represents the side length of the square.
 */
public class Square extends Shape {
    /**
     * Constructs a Square with the given side length.
     * @param length the side length of the square
     */
    public Square(double length) {
        super(length);
    }

    /**
     * Sets the side length of the square.
     * @param length the new side length
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates and returns the area of the square.
     * Uses the formula: side²
     * @return the area of the square rounded to two decimal places
     */
    @Override
    public double getArea() {
        return Math.round((length * length) * 100.0) / 100.0;
    }

    /**
     * Calculates and returns the perimeter of the square.
     * Uses the formula: 4 * side
     * @return the perimeter of the square rounded to two decimal places
     */
    @Override
    public double getPerimeter() {
        return Math.round((4 * length) * 100.0) / 100.0;
    }
}
