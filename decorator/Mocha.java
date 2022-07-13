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
    }

