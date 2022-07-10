package duck;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    public void display(){
        System.out.println("저는 모형오리 입니다!!");
    }
}
