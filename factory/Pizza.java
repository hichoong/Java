package factory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing" + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding toppings : ");
        for(int i =0; i<toppings.size(); i++) {
            System.out.println(" "+ toppings.get(i));
        }
    }
    void bake() {
        System.out.println("Bake for 25 minute at 350");
    }
    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    void box() {
        System.out.println("Place pizza in official pizzaStore box");
    }
    public String getName() {
        return name;
    }
}
