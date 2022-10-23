package algorithm.ex;

import java.util.Arrays;
import java.util.List;

/*
    프로그래머스 Lv.0 ~ Lv.1 수준
 */
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
        //나머지가 1이 되는 가장 작은 수
        public static int solution7(int n) {
            int answer = 0;
            //역순으로 계산해 보기
            for(int i = n; i > 0; i--) {
               if(n % i == 1) {
                   answer = i;
               }
            }
            return answer;
        }
        //콜라스 추측
        public static int solution8(int num) {
           int answer = 0;
           Long t = (long) num;
           while (true) {
                if(t % 2 == 0) {
                    t = t / 2;
                   answer++;
               }else if(t % 2 != 0) {
                   t = (t * 3) + 1;
                   answer++;
               }
               if(t == 1) {
                   break;
               }
               if(answer == 500) {
                   answer = -1;
                   break;
               }
           }
            System.out.println(answer);
           return answer;
        }
        //두 정수 사이의 합
        public static long solution9(int a, int b) {
            long answer = 0;
            long a_ = a;
            long b_ = b;
            //b가 큰 수일 경우
            if (a_ < b_) {
                long[] arr = new long[Math.abs((b-a)+1)];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = a_+i;
                    answer += arr[i];
            }
            //a가 큰 수인 경우
            }else if (a_ > b_){
                long[] arr = new long[Math.abs((a-b)+1)];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = b_+i;
                    answer += arr[i];
                }
            }else {
                answer = a;
            }
            return answer;
        }
        //서울에서 김서방 찾기
        public String solution10(String[] seoul) {
        String answer = "";
        int result = 0;
            for (int i = 0; i < seoul.length; i++) {
                if (seoul[i].equals("Kim")) {
                    result = i;
                    answer = "김서방은 "+result+ "에 있다";
                }
            }
        return answer;
    }
}