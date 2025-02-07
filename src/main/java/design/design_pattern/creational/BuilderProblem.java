package design.design_pattern.creational;

import java.text.DecimalFormat;

public class BuilderProblem {
    static class Pizza {
        private String dough = "";
        private String sauce = "";
        private String topping = "";

        public void setDough(String dough) {
            this.dough = dough;
        }

        public void setSauce(String sauce) {
            this.sauce = sauce;
        }

        public void setTopping(String topping) {
            this.topping = topping;
        }
    }

    static abstract class PizzaBuilder {
        protected Pizza pizza;

        public Pizza getPizza() {
            return pizza;
        }

        public void createNewPizzaProduct() {
            pizza = new Pizza();
        }

        public abstract void buildDough();
        public abstract void buildSauce();
        public abstract void buildTopping();
    }

    static class HawaiianPizzaBuilder extends PizzaBuilder {
        public void buildDough() {
            pizza.setDough("cross");
        }

        public void buildSauce() {
            pizza.setSauce("mild");
        }

        public void buildTopping() {
            pizza.setTopping("ham+pineapple");
        }
    }

    static class SpicyPizzaBuilder extends PizzaBuilder {
        public void buildDough() {
            pizza.setDough("pan baked");
        }

        public void buildSauce() {
            pizza.setSauce("hot");
        }

        public void buildTopping() {
            pizza.setTopping("pepperoni+salami");
        }
    }

    static class Waiter {
        private PizzaBuilder pizzaBuilder;

        public void setPizzaBuilder(PizzaBuilder pb) {
            pizzaBuilder = pb;
        }

        public Pizza getPizza() {
            return pizzaBuilder.getPizza();
        }

        public void constructPizza() {
            pizzaBuilder.createNewPizzaProduct();
            pizzaBuilder.buildDough();
            pizzaBuilder.buildSauce();
            pizzaBuilder.buildTopping();
        }
    }

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( hawaiianPizzaBuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();

        double a = -95.49999999999947;
        DecimalFormat f = new DecimalFormat("#0.##");
        System.out.println(f.format(a));
    }
}
