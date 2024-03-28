package week03.thisFolder;

public class Car {

    static final String COMPANY = "GENESIS";
    String model;
    String color;
    double price;

    double speed;
    char gear = 'P';
    boolean lights;


    public Car(String model) {
        this(model, "Blue", 50000000);
    }

    public Car(String model, String color) {
        this(model, color, 100000000);
    }

    public Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal() {
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

    Car returnInstance() {
        return this;
    }
}