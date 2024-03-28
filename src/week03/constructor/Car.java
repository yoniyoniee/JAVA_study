package week03.constructor;

public class Car {
    static final String COMPANY = "GENESIS";
    String model;
    String color;
    double price;

    double speed;
    char gear = 'P';
    boolean lights;



    //constructor
    //오버로딩
    public Car(String modelName) {
        model = modelName;
        System.out.println("첫번째 생성자");
    }

    public Car(String modelName, String colorName) {
        model = modelName;
        color = colorName;
        System.out.println("두번째 생성자");

    }

    public Car(String modelName, String colorName, double priceValue) {
        model = modelName;
        color = colorName;
        price = priceValue;
        System.out.println("세번째 생성자");

    }

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal(char type) {
        speed = 0;
        return speed;
    }

    double changeGear(char type) {
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

}
