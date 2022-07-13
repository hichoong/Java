package decorator;

public class SteamMilk extends CondimentDecorator{
    Beverage beverage;
    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public int cost() {
        return 200 +  beverage.cost();
    }


    public String getDescription() {
        return beverage.getDescription() + ", 스팀 밀크";
    }
}
