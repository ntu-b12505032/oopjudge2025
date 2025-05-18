/**
 * Represents a circle shape.
 * The length represents the diameter of the circle.
 */
public class Circle extends Shape {
    /**
     * Constructs a Circle with the given diameter.
     * @param length the diameter of the circle
     */
    public Circle(double length) {
        super(length);
    }

    /**
     * Sets the diameter of the circle.
     * @param length the new diameter
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates and returns the area of the circle.
     * Uses the formula: π * (r²) where r = diameter / 2
     * @return the area of the circle rounded to two decimal places,
     *         or 0.0 if diameter is 0
     */
    @Override
    public double getArea() {
        if (length == 0) return 0.0;
        double r = length / 2;
        return Math.round((Math.PI * r * r) * 100.0) / 100.0;
    }

    /**
     * Calculates and returns the perimeter (circumference) of the circle.
     * Uses the formula: π * diameter
     * @return the perimeter of the circle rounded to two decimal places,
     *         or 0.0 if diameter is 0
     */
    @Override
    public double getPerimeter() {
        if (length == 0) return 0.0;
        return Math.round((Math.PI * length) * 100.0) / 100.0;
    }
}
