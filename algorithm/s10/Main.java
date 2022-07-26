package algorithm.s10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //숫자 사각형 1
        Scanner sc = new Scanner(System.in);
        System.out.print("내가 입력한 수 : ");
        int inputNum = sc.nextInt();
        /* n = 4
         * 1 2 3 4
         * 1 2 3 4
         * 1 2 3 4
         * 1 2 3 4
         */
        for(int i = 0; i<inputNum; i++ ) {
            for(int j=0; j<inputNum; j++) {
                System.out.printf("%4d", j+1);
            }
            System.out.println();
        }
        /* n = 4
         * 1 2 3 4
         * 5 6 7 8
         * 9 10 11 12
         * 13 14 15 16
         */
        int num = 1;
        for(int i = 0; i<inputNum; i++ ) {
            for(int j=0; j<inputNum; j++) {
                System.out.printf("%4d",num);
                num++;
            }
            System.out.println();
        }
        /* n = 4
         * 1 2 3 4
         * 5 6 7 8
         * 9 10 11 12
         * 13 14 15 16
         */
        for(int i = 0; i<inputNum; i++ ) {
            for(int j=0; j<inputNum; j++) {
                System.out.printf("%4d", j + i + 1);
            }
            System.out.println();
        }
    }
}
