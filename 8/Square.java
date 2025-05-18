/**
 * Represents a square shape.
 * Extends the abstract Shape class and implements area and perimeter calculation.
 */
public class Square extends Shape {

    /**
     * Constructs a Square with the specified side length.
     * 
     * @param length the side length of the square
     */
    
    public Square(double length) {
        super(length);
    }

    /**
     * Sets the side length of the square.
     * 
     * @param length the new side length
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates the area of the square.
     * 
     * @return the area
     */
    @Override
    public double getArea() {
        return length * length;
    }

    /**
     * Calculates the perimeter of the square.
     * 
     * @return the perimeter
     */
    @Override
    public double getPerimeter() {
        return 4 * length;
    }
}
