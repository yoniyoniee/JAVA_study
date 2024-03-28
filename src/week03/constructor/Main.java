package week03.constructor;

public class Main {
    public static void main(String[] args) {
        Car car2 = new Car("GV60");
        System.out.println("car2.model = " + car2.model);
        System.out.println("car2.gear = " + car2.gear + "\n");


        Car car3 = new Car("GV70", "Blue");
        System.out.println("car3.model = " + car3.model);
        System.out.println("car3.color = " + car3.color);
        System.out.println("car3.gear = " + car3.gear + "\n");


        Car car4 = new Car("GV80", "Black", 50000000);
        System.out.println("car4.model = " + car4.model);
        System.out.println("car4.color = " + car4.color);
        System.out.println("car4.price = " + car4.price);
        System.out.println("car4.gear = " + car4.gear + "\n");
    }
}
