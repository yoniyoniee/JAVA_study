package week03.superExample;

public class Car {
    String company;
    String model;
    String color;
    double price;

    double speed;
    char gear = 'P';
    boolean lights;

    public Car() {}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    public double brakePedal() {
        speed = 0;
        return speed;
    }
    public char changeGear(char type) {
        gear = type;
        return gear;
    }

    public boolean onOffLights() {
        lights = !lights;

        return lights;
    }

    public void horn() {
        System.out.println("빵");
    }
}
