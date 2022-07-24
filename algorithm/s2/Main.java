package algorithm.s2;

public class Main {
    public static void main(String[] args) {

        //피보나치 수열
        //An = an-1 + an-2 n>=3
        //a1 = 1, a2 = 1

        // 값을 넣을 배열 만들어 주기
        int [] arr= new int [100];
        //피보나치 수열을 위한 초기 세팅
        arr[1] = 1;
        arr[2] = 1;
        // 1. 반복문을 이용해 풀기
        for(int i =3; i<100; i++) {
            arr[i] = arr[i-1] + arr[i-2] ;
        }
        for(int i= 1; i<=10; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        // 2. 다른 방법을 이용해 풀기
        //An = an-1 + an-2 n>=3
        //a1 = 1, a2 = 1
        int prePreNum = 1; //An-2
        int preNum = 1; //An-1
        System.out.print(prePreNum + " ");
        System.out.print(preNum + " ");
        for (int i=3; i<=10; i++ ) {
            int nNum = prePreNum+preNum;
            System.out.print(prePreNum+preNum+ " ");

            prePreNum = preNum;
            preNum = nNum;
        }
    }
}
