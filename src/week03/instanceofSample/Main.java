package week03.instanceofSample;

public class Main {
    public static void main(String[] args) {
        Parent pc = new Child();

        Parent p = new Parent();

        System.out.println(p instanceof Object);
        System.out.println(p instanceof Parent);
        System.out.println(p instanceof Child);

        Parent c = new Child();

        System.out.println(c instanceof Object);
        System.out.println(c instanceof Parent);
        System.out.println(c instanceof Child);
    }
}
