package decorator;

public class Soy extends CondimentDecorator{
    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    
    public int cost() {
        return 300 + beverage.cost();
    }

    
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}
