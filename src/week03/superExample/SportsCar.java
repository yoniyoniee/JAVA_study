package week03.superExample;

public class SportsCar extends Car{
    String engine;
    String model = "Ferrari";
    String color = "Red";
    double price = 30000000;

    public SportsCar(String engine) {
       this.engine = engine;
    }

    public void booster() {
        System.out.println("engine " + engine + " 부앙");
    }

    public void setCarInfo(String model, String color, double price) {
        super.model = model;
        super.color = color;
        this.price = price;
    }

    @Override
    public double brakePedal() {
        speed = 100;
        System.out.println("스포츠카 브레이크 없다");
        return speed;
    }

    @Override
    public void horn() {
        booster();
    }

}
