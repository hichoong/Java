package duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        //모랄드 덕 생성
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();
        //모형 덕 생성
        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();
        model.swim();
    }
}
