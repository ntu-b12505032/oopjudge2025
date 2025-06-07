/**
 * Represents an order of pizzas, with a maximum of 3 pizzas per order.
 * The class tracks the number of pizzas in the order and calculates the total cost.
 */
public class PizzaOrder {
    private int numberPizzas;
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;

    /**
     * Constructs a new PizzaOrder with no pizzas.
     */
    public PizzaOrder() {
        numberPizzas = 0;
        pizza1 = null;
        pizza2 = null;
        pizza3 = null;
    }

    /**
     * Sets the number of pizzas in the order.
     * @param numberPizzas the number of pizzas (must be between 1 and 3)
     * @return true if the number is valid (1-3), false otherwise
     */
    public boolean setNumberPizzas(int numberPizzas) {
        if (numberPizzas >= 1 && numberPizzas <= 3) {
            this.numberPizzas = numberPizzas;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Sets the first pizza in the order.
     * @param pizza1 the first Pizza object
     */
    public void setPizza1(Pizza pizza1) {
        this.pizza1 = pizza1;
    }

    /**
     * Sets the second pizza in the order.
     * @param pizza2 the second Pizza object
     */
    public void setPizza2(Pizza pizza2) {
        this.pizza2 = pizza2;
    }

    /**
     * Sets the third pizza in the order.
     * @param pizza3 the third Pizza object
     */
    public void setPizza3(Pizza pizza3) {
        this.pizza3 = pizza3;
    }

    /**
     * Calculates the total cost of the pizza order.
     * Only includes pizzas up to the set number of pizzas in the order.
     * @return the total cost of all pizzas in the order
     */
    public double calcTotal() {
        double total = 0.0;
        if (numberPizzas >= 1 && pizza1 != null) {
            total += pizza1.calcCost();
        }
        if (numberPizzas >= 2 && pizza2 != null) {
            total += pizza2.calcCost();
        }
        if (numberPizzas == 3 && pizza3 != null) {
            total += pizza3.calcCost();
        }
        return total;
    }

    /**
     * Main class demonstrating the usage of PizzaOrder.
     */
    public class Main {
        /**
         * Main method to test the PizzaOrder class.
         * @param args command line arguments (not used)
         */
        public static void main(String[] args) {
            Pizza pizza1 = new Pizza("large", 1, 0, 1); // cost: 14 + 2*2 = 18
            Pizza pizza2 = new Pizza("medium", 2, 2, 5); // cost: 12 + 2*9 = 30
            Pizza pizza3 = new Pizza(); // assume small, 0 toppings → cost = 10
    
            PizzaOrder order = new PizzaOrder();
            System.out.println(order.setNumberPizzas(5)); // false
            order.setNumberPizzas(2);
            order.setPizza1(pizza1);
            order.setPizza2(pizza2);
            System.out.println(order.calcTotal()); // 18 + 30 = 48.0
    
            order.setNumberPizzas(3);
            order.setPizza1(pizza1);
            order.setPizza2(pizza2);
            order.setPizza3(pizza3);
            System.out.println(order.calcTotal()); // 18 + 30 + 10 = 58.0
        }
    }
}