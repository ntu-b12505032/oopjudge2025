/**
 * Factory class to create different types of shapes.
 */
public class ShapeFactory {

    public enum Type {
        Triangle, Square, Circle
    }

    /**
     * Creates a shape instance based on type and length.
     * 
     * @param shapeType the type of shape to create
     * @param length    the length parameter (side or diameter)
     * @return a Shape object of the specified type
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
                throw new IllegalArgumentException("Unknown shape type");
        }
    }
}
