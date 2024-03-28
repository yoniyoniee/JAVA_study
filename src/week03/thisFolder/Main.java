package week03.thisFolder;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("GV60");
        System.out.println("car1.model = " + car1.model);
        System.out.println("car1.color = " + car1.color);
        System.out.println("car1.price = " + car1.price);
        System.out.println("car1.gear = " + car1.gear + "\n");


        Car car2 = new Car("GV70", "Red");
        System.out.println("car2.model = " + car2.model);
        System.out.println("car2.color = " + car2.color);
        System.out.println("car2.price = " + car2.price);
        System.out.println("car2.gear = " + car2.gear + "\n");


        Car car3 = new Car("GV80", "Black", 120000000);
        System.out.println("car3.model = " + car3.model);
        System.out.println("car3.color = " + car3.color);
        System.out.println("car3.price = " + car3.price);
        System.out.println("car3.gear = " + car3.gear + "\n");

        System.out.println(car3.returnInstance().model);
        System.out.println(car3.returnInstance().color);
        System.out.println(car3.returnInstance().price);


    }
}
