package algorithm.ex;

public class Jaegui {
    public static void main(String[] args) {
        //반복문 사용하지 않고 출력하는 법
            test(1);
    }
    public static void test(int num) {
        if (num > 10 ) {
            return;
        }
        System.out.println(num);
        num++;
        test(num);
    }
 }
