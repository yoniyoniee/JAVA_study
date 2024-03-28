package week03.packageExample.main;


import week3.packageExample.pk1.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        week3.packageExample.pk2.Car pkCar = new week3.packageExample.pk2.Car();

        car.horn();
        pkCar.horn();



//        week3.packageExample.pk1.Car car1 = new week3.packageExample.pk1.Car();
//        week3.packageExample.pk2.Car car2 = new week3.packageExample.pk2.Car();
//
//        car1.horn();
//        car2.horn();
    }
}
