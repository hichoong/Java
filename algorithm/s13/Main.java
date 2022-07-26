package algorithm.s13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("내가 입력한 값 : ");
        int inputNum = sc.nextInt();
        int arr[][] = new int[inputNum][inputNum];
        for (int i=0; i<inputNum; i++) {
            for (int j=0; j<inputNum; j++) {
                arr [i][j] = (i+1) * (j+1);
            }
        }

        for (int i=0; i<inputNum; i++) {
            for (int j=0; j<inputNum; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }

    }
}
