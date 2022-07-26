package algorithm.s11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            //숫자 사각형 2
            Scanner sc = new Scanner(System.in);
             System.out.print("내가 입력한 수 : ");
            int inputNum = sc.nextInt();
            int arr[][] = new int[inputNum][inputNum];
            /* n = 3
            * 1 2 3
            * 6 5 4
            * 7 8 9
            */
            for(int i = 0;i<inputNum ; i++ ) {
               if(i % 2 == 0) {
                   for (int j =0;j<inputNum ; j++ )
                   arr[i][j] = i * inputNum + j + 1;
               }else {
                   for (int j = inputNum-1 ; j >= 0; j--) {
                           arr[i][j] = i * inputNum + inputNum - j;
                       }

                   }

               }
            for (int i = 0; i< inputNum; i++) {
                for(int j = 0; j < inputNum; j++) {
                    System.out.printf("%4d", arr[i][j]);
                }
                System.out.println();
            }
    }

}


