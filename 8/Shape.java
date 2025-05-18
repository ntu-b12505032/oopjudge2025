/**
 * The abstract base class representing a geometric shape.
 * It provides a length attribute and abstract methods for area and perimeter calculation.
 */
public abstract class Shape {
	protected double length;	

	
    /**
     * Constructor to initialize the shape with a given length.
     * 
     * @param length the initial length
     */
	public Shape(double length){
		this.length=length;
	}
	    /**
     * Sets the length of the shape.
     * 
     * @param length the new length to set
     */
	public abstract void setLength(double length);

	    /**
     * Calculates the area of the shape.
     * 
     * @return the area of the shape
     */
	public abstract double getArea();

	    /**
     * Calculates the perimeter of the shape.
     * 
     * @return the perimeter of the shape
     */
	public abstract double getPerimeter();
	
	
    /**
     * Returns a formatted string containing area and perimeter.
     * Rounds values to 2 decimal places and handles zero properly.
     * 
     * @return a formatted info string
     */
	public String getInfo(){
		return "Area = " + getArea() + ", Perimeter = " + getPerimeter();
	}
}