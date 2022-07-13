package decorator;

public class Whip extends CondimentDecorator{
    Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    
    public int cost() {
        return 200 + beverage.cost();
    }

    
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }
}
