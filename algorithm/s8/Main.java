package algorithm.s8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //팩토리얼  구하기
        Scanner sc = new Scanner(System.in);
        //입력 값 넣기
        int inputNum;
        inputNum = sc.nextInt();
        //결과 값 담을 변수
        int accNum = 1;
        // 5! = 5x4x3x2x1
        // 7! = 7x6x5x4x3x2x1
        for(int i =1; i <= inputNum; i++) {
            accNum *= i;
        }
        //반대로 해도 값은 같음
        //for(int i  =inputNum; i >= inputNum; i--) {
        //accNum *= i;
        //}
    }
}
