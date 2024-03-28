package week03.staticFolder;

public class Car {
    static String company = "GENESIS";
    String model;
    String color;
    double price;

    double speed;
    char gear;
    boolean lights;

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

    String getCompany() {
        return "(주)" + company;
    }

    static String  setCompany(String companyName) {
        company = companyName;
        return company;
    }
}
