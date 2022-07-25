package algorithm.s4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //10진수를 2진수로 나타내기
        Scanner sc = new Scanner(System.in);
        int bin[] = new int[100];
        System.out.print("내가 선택한 수 : ");
        int inputNum = sc.nextInt(); //예시는 19

        /*
        * 19/2 9...1
        * 9/2  4...1
        * 4/2  2...0
        * 2/2  1...0
        * 1/2  0...1
        * 19 = 11001
        * */
        int i = 0;
        int mok = inputNum;
        while (mok > 0) {
            bin[i] = mok % 2;
            mok /= 2;
            i++;
        }
            i--;
        for (;i>=0; i--) {
            System.out.print(bin[i]);
        }
    }
}
