package week02.array;

public class Arr03 {
    public static void main(String[] args) {
        // 얕은 복사
        int[] a = {1, 2, 3, 4};
        int[] b = a;

        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정

        System.out.println(a[0]);


    }
}
