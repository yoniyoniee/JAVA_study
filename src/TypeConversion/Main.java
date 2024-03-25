package TypeConversion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        System.out.println("Our First Project! :");

        // 형변환

        //byte -> int
        byte byteNum = 10;
        int intNum = byteNum;
        System.out.println(intNum);

        // char -> int
        char charAlpabet = 'A';
        intNum = charAlpabet;
        System.out.println(intNum);

        // int -> long
        intNum = 100;
        long longNum = intNum;
        System.out.println(longNum);

        // int -> double
        intNum = 200;
        double doubleNum = intNum;
        System.out.println(doubleNum);


    }
}