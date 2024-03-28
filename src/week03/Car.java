package week03;

public class Car {

    String company;
    String model = "GV80";
    String color;
    double price;
    double speed;
    char gear;
    boolean lights = true;

    //객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;


    public Car() {
        System.out.println("생성자 호출");

    } // 생성자 - 생략가능

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;

        return speed;
    }

    double breakPedal() {
        speed = 0;

        return speed;
    }

    char changeGear(char type) {
        gear = type;

        return gear;
    }

    boolean onOffLights() {
        lights = !lights;

        return lights;

    }

    void horn() {
        System.out.println("빵빵");
    }

    void carSpeeds(double ...speeds) {
        for(double v: speeds) {
            System.out.println("v = " + v);
        }

    }

}
