package decorator;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "하우스 브렌드 커피";
    }
    public int cost () {
        return 1500;
    }

}
