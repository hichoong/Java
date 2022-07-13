package decorator;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription () {
        return beverage.getDescription() + ", 모카";
    }
    public int cost () {
        return 500 + beverage.cost();
    }
}
