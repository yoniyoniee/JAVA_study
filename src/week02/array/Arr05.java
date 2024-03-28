package week02.array;

public class Arr05 {
    public static void main(String[] args) {
        // 문자 char, 문자열 string
        // String = char를 배열로 만든 것

        // 기본형 변수 vs 참조형 변수
        // 기본현 변수 : 소문자로 시작
        // 참조형 변수 : 대문자로 시작
        // Wrapper class에서 기본형 변수 감싸줄 때(boxing), int -> Integer
        // 기본형 변수는 값 자체를 저장, 참조형 변수는 별도의 공간에 값을 저장 후 그 주소를 저장 = 주소형 변수

        // char < String
        // String 은 가지고 있는 기능이 많다
        // Wrapper class와도 비슷하다
        // -> 기본형 변수가 가지고 있는 기능 제한 -> 다양한 기능을 제공하는 Wrapper을 감쌈으로써, 추가기능을 더한다.

        String str = "ABCD";

        // length 문자열 길이 반환
        int strLength = str.length();
        System.out.println(strLength);

        // charAt(int index) 문자열에서 해당 index 위치의 문자 반환
        char strChar = str.charAt(1);
        System.out.println(strChar);

        // substring(int fromIdx, int toIdx) from~toIdx-1 까지의 문자열 잘라서 반환
        String strSub = str.substring(0,3);
        System.out.println(strSub);

        // equals(String str)
        String newStr = "ABCD";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);

        // toCharArray() : String -> char[]
        char[] strCharArray = str.toCharArray();

        // char[] -> String -> char
        char[] charArray = {'A', 'B', 'C', 'D'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);
    }
}
