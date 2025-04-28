/**
 * The Pizza class represents a pizza with a specific size and quantity of toppings.
 * It can calculate its total cost, and compare itself to other Pizza objects.
 */
public class Pizza {
    /** The size of the pizza: small, medium, or large. */
    private String size;

    /** The number of cheese toppings. */
    private int numberOfCheese;

    /** The number of pepperoni toppings. */
    private int numberOfPepperoni;

    /** The number of ham toppings. */
    private int numberOfHam;

    /**
     * Default constructor.
     * Initializes size to "small" and each topping count to 1.
     */
    public Pizza() {
        this.size = "small";
        this.numberOfCheese = 1;
        this.numberOfPepperoni = 1;
        this.numberOfHam = 1;
    }

    /**
     * Constructor with parameters.
     * Initializes all attributes based on provided arguments.
     *
     * @param size the size of the pizza (small, medium, or large)
     * @param numberOfCheese the number of cheese toppings
     * @param numberOfPepperoni the number of pepperoni toppings
     * @param numberOfHam the number of ham toppings
     */
    public Pizza(String size, int numberOfCheese, int numberOfPepperoni, int numberOfHam) {
        this.size = size;
        this.numberOfCheese = numberOfCheese;
        this.numberOfPepperoni = numberOfPepperoni;
        this.numberOfHam = numberOfHam;
    }

    /**
     * Returns the size of the pizza.
     * @return the pizza size
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the size of the pizza.
     * @param size the new size of the pizza
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Returns the number of cheese toppings.
     * @return number of cheese toppings
     */
    public int getNumberOfCheese() {
        return numberOfCheese;
    }

    /**
     * Sets the number of cheese toppings.
     * @param numberOfCheese the new number of cheese toppings
     */
    public void setNumberOfCheese(int numberOfCheese) {
        this.numberOfCheese = numberOfCheese;
    }

    /**
     * Returns the number of pepperoni toppings.
     * @return number of pepperoni toppings
     */
    public int getNumberOfPepperoni() {
        return numberOfPepperoni;
    }

    /**
     * Sets the number of pepperoni toppings.
     * @param numberOfPepperoni the new number of pepperoni toppings
     */
    public void setNumberOfPepperoni(int numberOfPepperoni) {
        this.numberOfPepperoni = numberOfPepperoni;
    }

    /**
     * Returns the number of ham toppings.
     * @return number of ham toppings
     */
    public int getNumberOfHam() {
        return numberOfHam;
    }

    /**
     * Sets the number of ham toppings.
     * @param numberOfHam the new number of ham toppings
     */
    public void setNumberOfHam(int numberOfHam) {
        this.numberOfHam = numberOfHam;
    }

    /**
     * Calculates and returns the total cost of the pizza.
     * Cost depends on size and number of toppings.
     *
     * @return the total cost of the pizza
     */
    public double calcCost() {
        int totalToppings = numberOfCheese + numberOfPepperoni + numberOfHam;
        double basePrice;
        
        if (size.equalsIgnoreCase("small")) {
            basePrice = 10;
        } else if (size.equalsIgnoreCase("medium")) {
            basePrice = 12;
        } else if (size.equalsIgnoreCase("large")) {
            basePrice = 14;
        } else {
            basePrice = 0; // Invalid size
        }

        return basePrice + (2 * totalToppings);
    }

    /**
     * Determines if this pizza is equal to another pizza.
     * Equality is based on size and the number of each type of topping.
     *
     * @param other another Pizza object to compare
     * @return true if both pizzas are identical, false otherwise
     */
    public boolean equals(Pizza other) {
        return this.size.equalsIgnoreCase(other.size) &&
               this.numberOfCheese == other.numberOfCheese &&
               this.numberOfPepperoni == other.numberOfPepperoni &&
               this.numberOfHam == other.numberOfHam;
    }

    /**
     * Returns a string representation of the pizza.
     * Format: size = ..., numOfCheese = ..., numOfPepperoni = ..., numOfHam = ...
     *
     * @return string describing the pizza
     */
    @Override
    public String toString() {
        return "size = " + size +
               ", numOfCheese = " + numberOfCheese +
               ", numOfPepperoni = " + numberOfPepperoni +
               ", numOfHam = " + numberOfHam;
    }
    public static void main(String[] args) {
        Pizza pizza = new Pizza("large", 3, 1, 5);
        System.out.println(pizza.getSize());
        System.out.println(pizza.getNumberOfCheese());
        System.out.println(pizza.getNumberOfPepperoni());
        System.out.println(pizza.getNumberOfHam());

        pizza = new Pizza();
        pizza.setSize("medium");
        pizza.setNumberOfCheese(2);
        pizza.setNumberOfPepperoni(4);
        pizza.setNumberOfHam(1);

        System.out.println(pizza.getSize());
        System.out.println(pizza.getNumberOfCheese());
        System.out.println(pizza.getNumberOfPepperoni());
        System.out.println(pizza.getNumberOfHam());
        System.out.println(pizza.calcCost());
        System.out.println(pizza.toString());
        System.out.println(pizza.equals(new Pizza("large", 2, 4, 1)));
        System.out.println(pizza.equals(new Pizza()));
        System.out.println(pizza.equals(new Pizza("medium", 2, 4, 1)));
    }
}
