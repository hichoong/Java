package algorithm.ex;

import java.util.Arrays;
import java.util.List;

class Solution {
    public static int solution3(int n) {
        int answer = 0;
        for (int j = n; j >= 0; j--) {
            if (j % 2 == 0) {
                answer += j;
            }
        }
        return answer;
    }

    public double solution2(int[] numbers) {
        double answer = 0;
        for (int i : numbers) {
            answer += i;
        }
        answer = answer / numbers.length;
        return answer;
    }

    public int solution3(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }

    public static long solution4(long n) {
        long answer = 0;
        while (n != 0) {
            answer = answer * 10 + n % 10;
            n /= 10;
        }
        return answer;
    }

    //x만큼 간격이 있는 n개의 숫자
    public static long[] solution5(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (x * (x + i));
            System.out.println(answer[i]);
        }
        return answer;
    }
    //정수 내림차순으로 배치하기
    public static long solution6(long n) {
        //숫자를 String 타입으로 변환
        String temp = Long.toString(n);
        //n의 길이만큼 숫자를 담을 배열 준비
        long[] digits = new long[temp.length()];
        String result = "";
        long answer = 0;
        //String을 문자로 변환해서 배열에 담기
        for (int i = 0; i < temp.length(); i++) digits[i] = temp.charAt(i) - '0';
        //반복문을 통한 숫자 위치 조정
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                long f = 0;
                if (digits[j] < digits[j + 1]) {
                    f = digits[j + 1];
                    digits[j + 1] = digits[j];
                    digits[j] = f;
                }
            }
        }
        //배열에 있던 숫자를 String으로 변환
        for(long i : digits){
            result += i;
        }
        //String을 다시 숫자로 변환
        answer = Long.parseLong(result);
        return answer;
    }
}