package week02.array;

public class Arr10 {
    public static void main(String[] args) {

        // 최소값 구하기
        int[] arr = {1, 2,5, 0, 3,10, 7, 8};

        // 최소값 초기화
        int min = arr[0];

        // 최소값 구하기
        for (int num: arr) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println(min);
    }
}
