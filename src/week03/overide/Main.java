package week03.overide;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.horn(); // 부모 horn

        System.out.println();

        SportsCar sportsCar = new SportsCar("Orion");

        sportsCar.brakePedal();
        sportsCar.horn(); // 재정의한 horn
    }
}
