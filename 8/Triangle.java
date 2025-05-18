/**
 * Represents an equilateral triangle.
 * Extends the abstract Shape class and implements area and perimeter calculation.
 */
public class Triangle extends Shape {

    /**
     * Constructs a Triangle with the specified side length.
     * 
     * @param length the side length of the triangle
     */
    public Triangle(double length) {
        super(length);
    }

    /**
     * Sets the side length of the triangle.
     * 
     * @param length the new side length
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates the area of the equilateral triangle.
     * 
     * @return the area
     */
    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * length * length;
    }

    /**
     * Calculates the perimeter of the triangle.
     * 
     * @return the perimeter
     */
    @Override
    public double getPerimeter() {
        return 3 * length;
    }
}
