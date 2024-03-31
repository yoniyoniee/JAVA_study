package week04.Sample1;

// 예외 클래스 만들어서 예외를 정의
public class BadException extends Exception{

    public BadException()  {
        super("예외처리 필수");
    }
}
