package decorator;

public class ChoongsCoffee {
    public static void main(String[] args) {
        System.out.println("안녕하세요 충스커피입니다!");

        Beverage beverage = new Espresso(); //3000
        System.out.println(beverage.getDescription() + " 가격 : " + beverage.cost() + "원입니다.");

        Beverage beverage2 = new DarkRoast(); //1500
        beverage2 = new Mocha(beverage2); //500
        beverage2 = new Mocha(beverage2); //500
        beverage2 = new Whip(beverage2); //200
        System.out.println(beverage2.getDescription() + " 가격 : " + beverage2.cost() + "원입니다.");

        Beverage beverage3 = new HouseBlend(); //1500
        beverage3 = new Soy(beverage3); //300
        beverage3 = new Mocha(beverage3); //500
        beverage3 = new Whip(beverage3); // 200
        System.out.println(beverage3.getDescription() + " 가격 : " + beverage3.cost() + "원입니다.");
    }
}
