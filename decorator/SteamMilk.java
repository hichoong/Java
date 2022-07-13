package decorator;

public class SteamMilk extends CondimentDecorator{
    Beverage beverage;
    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
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


    public String getDescription() {
        return beverage.getDescription() + ", 스팀 밀크";
    }
}
