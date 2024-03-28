package week03.sample;


public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getNumber());
        System.out.println(main.getNumber());

    }


    public int getNumber() {
        // 매서드 내부에서 생성 및 소멸
        int number = 1; // 지역변수.
        number += 1;
        return number;
    }
}
