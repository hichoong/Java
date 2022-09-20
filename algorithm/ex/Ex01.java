package algorithm.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {
    public static double solution(int[] arr) {
        long sum = 0;
        double answer = 0;
        //정해진 수 까지 더하기
        for(int i : arr) {
            sum += i;
        }
        //정해진 수를 숫자 개수만큼 나누기
        double len = arr.length;
        answer = sum/len;
        System.out.println(answer);
        return answer;
    }

    public static long solution2(long n) {
        long answer = -1;
        Double sqrt = Math.sqrt(n); //제곱근 구하기

        System.out.println(sqrt);

        if(sqrt.intValue() == sqrt) {
            answer = sqrt.intValue() + 1; //제곱근의 수에 + 1
            answer = answer * answer; //더해진 수 곱하기
        }
        System.out.println(answer);
        return answer;
    }

    public static int[] solution3(long n) {
        //배열 길이 구하기
        int x = (int) (Math.log10(n) + 1);
        int[] answer = new int[x];
        //배열에 숫자 넣기
        for(int i = 0; n != 0; i++){
            answer[i] = (int)(n % 10);
            n /= 10;
        }
       /* for(int i = 0; i<x; i++){
            answer[i] = (int)(n % 10);
            n /= 10;*/
        return answer;
    }

    public static int[] solution4(long n) {
        String[] split = String.valueOf(n).split("");
        Arrays.sort(split, Comparator.reverseOrder());
        return Arrays.stream(split).mapToInt(Integer::valueOf).toArray();

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
//        solution(arr);
       // solution2(3);
        solution4(12345);
        for (int i : solution4(12345)) {
            System.out.println(i);
        }
    }
}
