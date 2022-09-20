package algorithm.ex;

import java.util.Locale;

public class Ex02 {
    //문자열 내 p와 y의 개수
    public static void main(String[] args) {
        solution("ppPPyyYY");
    }
    public static boolean solution(String s) {
        //문자로 변환
        String[] arr = s.toUpperCase().split("") ;
        int cntp = 0;
        int cnty = 0;
        boolean answer = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("P")) {
                cntp++;
            } else if (arr[i].equals("Y")) {
                cnty++;
            }
        }
        if (cntp == cnty) {
            return answer;
        } else {
            answer = false;
            return answer;
        }
    }
}