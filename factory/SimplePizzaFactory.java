package factory;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();

        } else if (type.equals("pepperoni")) {
            pizza = new pepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new clamPizza();
        } else if (type.equals("veggie")) {
            pizza = new veggiePizza();
        }
            return pizza;
        }
}
