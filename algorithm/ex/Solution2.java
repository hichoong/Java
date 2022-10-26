package algorithm.ex;



import java.util.Arrays;
import java.util.Comparator;

/*
    프로그래머스 Lv.2 문제
 */
public class Solution2 {
    //최댓값과 최솟값
    public static String solution1(String s) {
        String answer = "";
        //String을 String 배열로 만들기
        String[] result = s.split(" ");
        //문자열 숫자열로 변환
        int num[] = Arrays.stream(result).mapToInt(Integer::parseInt).toArray();
        int min = num[0];
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if ( min > num[i]) {
                min = num[i];
            }else if (max < num[i]) {
                max = num[i];
            }
        }
        answer = min +" " +max;
        return answer;
    }
    //JadenCase 문자열 만들기
    /*
    내가 푼 풀이는 값이 제대로 출력되지 않음... 그냥 String 배열을 더하면 엄청난 메모리를 차지
    String은 불변이기 때문에 메모리를 계속 차지,,, 그래서 StringBuilder를 사용해서 메모리 관리

     */

    /* public static String solution2(String s) {
        String answer = "";
        String[] result = s.split("\\s+");
        for (int i = 0; i < result.length; i++) {
            answer += result[i].substring(0,1).toUpperCase() + result[i].substring(1) + " ";
        }
        return answer.substring(0, answer.length() - 1);
    }*/

    //문제 풀이
    public static String solution2(String s) {
        StringBuilder sb = new StringBuilder();
        boolean blank = true;
        for (char c : s.toCharArray()) {
            sb.append(blank ? Character.toUpperCase(c) : Character.toLowerCase(c));
            blank = c == ' ' ? true : false;
        }
        return sb.toString();
    }
}

