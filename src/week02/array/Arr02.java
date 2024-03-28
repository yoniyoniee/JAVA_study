package week02.array;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        // 초기화

        // 1. 배열에 특정값 대입해서 선언
        int[] intArr = {1,2,3,4,5};
        String[] stringArray = {"a", "b", "c", "d"};

        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

        for (int item: intArr) {
            System.out.println(item);
        }

        // 배열의 주소를 모두 같은 값으로 초기화
        Arrays.fill(intArr, 1);

        for (int item: intArr) {
            System.out.println(item);
        }
    }
}























