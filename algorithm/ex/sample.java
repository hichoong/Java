package algorithm.ex;

import java.util.Arrays;

public class sample {
    public static void main(String[] args) {
        int []arr = new int[] {10,11 ,2 ,8 ,3, 5, 1, 20, 30, 19, 60, 58,42, 32};
        System.out.println(Arrays.toString(arr));
        //bubbleSort(arr);
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //버블 정렬
    public static int[] bubbleSort(int[] arr) {
        //숫자 맨 앞부터 2개씩 비교 (i, i+1 비교)
        //만약에, 자리가 이상하면 둘이 자리 바꿈
        //위 작업 반복
        int num = arr[0];
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = 0; j < arr.length-1 -i; j++) {
                if (arr[j] > arr[j + 1]) {
                    num = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = num;
                }
            }
        }
        return arr;
    }
    //선택정렬
    public static int[] selectionSort(int[]arr) {
        //한바퀴 제일 작은거 찾기 인덱스()
        //맨 앞에 넣기
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i; j< arr.length ; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            //맨 앞에 넣기
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}


