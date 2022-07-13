package decorator;

public class Soy extends CondimentDecorator{
    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getSize () {
        return beverage.getSize();
    }
    public int cost() {
        int cost= beverage.cost();

        if (getSize() == beverage.TALL) {
            cost += 200;
        }
        if (getSize() == beverage.GRANDE) {
            cost += 300;
        }
        if (getSize() == beverage.VENTI) {
            cost += 500;
        }
        return cost;


    }

    
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}
