/**
 * Factory class for creating different types of Shape instances.
 */
public class ShapeFactory {
    /**
     * Enum representing the types of shapes that can be created.
     */
    public enum Type {
        Triangle,
        Square,
        Circle
    }

    /**
     * Creates a Shape instance based on the specified type and length.
     *
     * @param shapeType the type of shape to create (Triangle, Square, or Circle)
     * @param length    the side length or diameter of the shape
     * @return a Shape object of the specified type with the given length
     */
    public Shape createShape(Type shapeType, double length) {
        switch (shapeType) {
            case Triangle:
                return new Triangle(length);
            case Square:
                return new Square(length);
            case Circle:
                return new Circle(length);
            default:
                return null;
        }
    }
}
