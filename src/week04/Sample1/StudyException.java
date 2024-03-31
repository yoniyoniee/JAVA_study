package week04.Sample1;

public class StudyException {


    public static void main(String[] args) {

        OurClass ourClass = new OurClass();


        try{
            ourClass.thisMethodIsDangerous();

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("에러 발생하던 안하던 finally");
        }
    }
}
