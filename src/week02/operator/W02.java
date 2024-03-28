package week02.operator;

public class W02 {
    public static void main(String[] args) {
        int z;
        int x = 5;
        int y = 10;

        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2);
        System.out.println(4 % 2);

        System.out.println("------------");

        // 우선순위 연산
        System.out.println(2+2*2);
        System.out.println((2+2)*2);

        z = x - y;
        System.out.println(z);

        z = x / y;
        System.out.println(z);

        z = x % y;
        System.out.println(z);


        z = x * y;
        System.out.println(z);
    }
}
