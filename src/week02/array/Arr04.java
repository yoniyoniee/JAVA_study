package week02.array;

import java.util.Arrays;

public class Arr04 {
    public static void main(String[] args) {

        // Arrays.copyOf() 메서드
        int[] a = {1, 2, 3, 4};
        int[] b = Arrays.copyOf(a, a.length); // 배열과 함께 LEngth값도 함께 넣어준다.

        a[3] = 0;
        System.out.println(a[3]);
        System.out.println(b[3]);
    }
}
