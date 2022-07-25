package algorithm.s6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //최대 공약수 구하기
        Scanner sc = new Scanner(System.in);
        //두 수 입력하기
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int small;
        int big;

        if (num1 > num2) {
            big = num1;
            small = num2;
        }else {
            big = num2;
            small = num1;
        }
        //처음 최대공약수를 담을 변수 생성
        int gcd = 1; //모두 1을 포함
        for (int i=1; i<=small; i++) {
            if (big % i ==0 && small % i == 0) {
                gcd = i;
            }

        }
        System.out.println(gcd);
    }
}
