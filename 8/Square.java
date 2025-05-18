/**
 * Represents a square shape.
 * Provides implementation for area and perimeter calculation.
 */
public class Square extends Shape {

    /**
     * Constructs a Square with given side length.
     * 
     * @param length the side length
     */
    public Square(double length) {
        super(length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }
}
