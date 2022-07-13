package decorator;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        description = "다크로스트 커피";
    }
    public int cost () {
        return 1500;
    }
}
