package algorithm.s1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //학생 인스턴스 생성
        Student st1 = new Student("손오공", "1234");
        Student st2 = new Student("저팔계", "5678");
        Student st3 = new Student("사오정", "9123");
        //배열에 생성
        ArrayList<Student> list = new ArrayList();
        //배열에 학생 정보 담기
        list.add(st1);
        list.add(st2);
        list.add(st3);
        //배열에 학생이 잘 담겼는지 확인
        for (Student s : list) {
            System.out.println("학생이름 : " + s.getName() + ", 학생번호 : " + s.getNo());
        }
        //회원 선택해서 출력하기
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("회원을 조회하고 싶으시면 y, 프로그램을 종료하시려면 n을 눌러주세요");
            String input = sc.next();
            if (input.equals("y")) {
                System.out.println("조회를 시작합니다");
                System.out.print("조회하실 학생이름을 적어주세요 : ");
                String name = sc.next();
                boolean flag = false;
                for (Student s : list) {
                    if (name.equals(s.getName())) {
                        System.out.println(name + " 학생의 번호는 : " + s.getNo());
                        flag = true;
                    }
                }
                if (!flag) {
                    System.out.println("해당 학생은 존재하지 않습니다.");
                }
            } else if (input.equals("n")) {
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}
