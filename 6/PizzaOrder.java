public class PizzaOrder {
    private int numberPizzas;
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;

    public PizzaOrder() {
        numberPizzas = 0;
        pizza1 = null;
        pizza2 = null;
        pizza3 = null;
    }

    public boolean setNumberPizzas(int numberPizzas) {
        if (numberPizzas >= 1 && numberPizzas <= 3) {
            this.numberPizzas = numberPizzas;
            return true;
        } else {
            return false;
        }
    }

    public void setPizza1(Pizza pizza1) {
        this.pizza1 = pizza1;
    }

    public void setPizza2(Pizza pizza2) {
        this.pizza2 = pizza2;
    }

    public void setPizza3(Pizza pizza3) {
        this.pizza3 = pizza3;
    }

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
    public class Main {
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