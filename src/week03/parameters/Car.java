package week03.parameters;


public class Car  {

    String company;
    String model;
    String color;
    double price;

    double speed;
    char gear;
    boolean lights;

    Tire tire;
    Door door = new Door();
    Handle handle = new Handle();

    public Car() {}

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal(char type) {
        speed = 0;
        type = 'P';
        changeGear(type);
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

    Tire setTire(Tire tireCompany) {
        tireCompany.company = "KIA";
        tire = tireCompany;
        return tire;
    }

}
