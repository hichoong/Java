package algorithm.s12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("내가 입력한 수 : ");
        int inputNum = sc.nextInt();
        int arr[][] = new int[inputNum][inputNum];
        /* n = 3
        * 1 4 7
        * 2 5 8
        * 3 6 9
        *
        * */
        int num = 1;
        for (int i =0; i<inputNum; i++) {
            for (int j=0; j<inputNum; j++) {
              arr[j][i] = num;
              num++;
            }

        }
        for (int i =0; i<inputNum; i++) {
            for (int j=0; j<inputNum; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        //2번째 방법
        for (int i =0; i<inputNum; i++) {
            for (int j=0; j<inputNum; j++) {
                arr[j][i] = i*inputNum + j+1;

            }

        }
        for (int i =0; i<inputNum; i++) {
            for (int j=0; j<inputNum; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
