/**
 * A factory class to create Shape instances based on a given type.
 */
public class ShapeFactory {

    public enum Type {
        Triangle, Square, Circle
    }

    /**
     * Creates a Shape instance based on the specified type and length.
     * 
     * @param shapeType the type of shape to create
     * @param length the length to use for the shape
     * @return a Shape object (Triangle, Square, or Circle)
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
                throw new IllegalArgumentException("Unsupported shape type");
        }
    }
}
