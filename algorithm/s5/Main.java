package algorithm.s5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //영어 문자 대소문자 뒤바꾸기
    Scanner sc = new Scanner(System.in);
    //입력값 받기
    System.out.print("내가 입력한 영문자 : ");
    String input = sc.nextLine();
    char []arr;
    arr = input.toCharArray();
        System.out.println(arr);
        for (int i=0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) (arr[i] + ('A'-'a'));
            }else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] - ('A'-'a'));
            }else {
                System.out.println("알 수 없음");
            }
        }
        System.out.println(arr);
    }
}
