package algorithm.s3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inputNum = new int[10];
        for(int i=0; i<10; i++) {
            inputNum[i] = sc.nextInt();
        }

        int[] mode = new int[10];
        //index -> 출현한 수
        //index 값 -> index(출현한 수)가 몇번나왔는지 저장하는 용도

        //"mode[3]" = 5 => 3번숫자가, 5번출현했다"
        for(int i=0; i<10; i++) {
            mode[inputNum[i]]++;
        }

        int modeNum = 0; //최빈수
        int modeCnt = 0; //최빈수가 나온 횟수

        for(int i=0; i<10; i++) {
            if (modeCnt < mode[i]) {
                modeCnt = mode[i];
                modeNum = i;
            }
        }
        System.out.println("최빈수는 : " + modeNum + " 나온횟수는 : " + modeCnt );
    }
}
