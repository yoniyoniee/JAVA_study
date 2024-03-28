package week4.Sample1;

public class OurClass {
    private final boolean just = true;

    //throw : 예외를 발생시키다
    // CheckedException => 처리 안하면 컴파일 오류
    public void thisMethodIsDangerous () throws BadException{

        if(just){
            throw new BadException();
        }
    }
}
