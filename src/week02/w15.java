package week02;

public class w15 {

    public static void main(String[] args) {

        for(int i=0; i < 4; i++) { // 변수 i 값은 0 ~ 3 까지 반복
            System.out.println(i + "번째 출력"); // i 변수와 문자열 합치기
        }

        // 향상된 for문
        //기존 : for 문 안에 3개의 표현이 들어간다. (초기값 ; 조건문 ; 증가연산)
        // 향상된 for문 : 2개로 줄여준다.
        int[] numbers = {3, 6, 9, 12, 15};
        for (int number: numbers) {
            System.out.println(number + " ");
        }

    }
}
