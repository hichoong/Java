package algorithm.s7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력한 수가 소수인지 판단
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        //소수 = 1 과 자신만 나누어 떨어지는 수
        boolean ifPrimeNumber = true;
        for (int i = 2; i <= num/2; i++) {
            if (num % i ==0 ) {
                //소수가 아님 
               ifPrimeNumber = false;
            }
            
        }
        if (ifPrimeNumber) {
            System.out.println(num + " 은 소수 입니다.");
        }else {
            System.out.println(num + " 은 소수가 아닙니다.");
        }
    }
}
