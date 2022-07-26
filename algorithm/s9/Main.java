package algorithm.s9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //각 자릿수 합 구하기
        Scanner sc = new Scanner(System.in);
        System.out.print("내가 입력한 수 : ");
        int inputNum = sc.nextInt();
        int accSum = 0;

        while(inputNum > 0) {
            accSum += inputNum % 10;
            inputNum /= 10;
        }
        System.out.println("각 자리 합 : " + accSum);
    }
}
