package week03;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        double speed = car.gasPedal(100, 'D');
        System.out.println("speed = " + speed);

        boolean lights = car.onOffLights();
        System.out.println("lights = " + lights);

        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(110, 149, 299);





//        System.out.println("car.model = " + car.model);
//        System.out.println("car.color = " + car.color);
//        System.out.println();
//
//        System.out.println("car.speed = " + car.speed);
//        System.out.println("car.gear = " + car.gear);
//        System.out.println("car.lights = " + car.lights);
//        System.out.println();
//
//
//        System.out.println("car.tire = " + car.tire);
//        System.out.println("car.door = " + car.door);
//        System.out.println();
//
//        car.color = "blue";
//        car.speed = 100;
//        car.lights = false;
//
//
//        System.out.println("car.color = " + car.color);
//        System.out.println("car.speed = " + car.speed);
//
//        System.out.println("car.lights = " + car.lights);



//        Car car1 = new Car();
//        Car car2 = new Car();
//
//        System.out.println(car1); // 객체를 별도 공간에 저장하고 주소를 가져온다.


//        Car[] carArray = new Car[3];
//
//        Car car1 = new Car();
//        car1.changeGear('P');
//        carArray[0] = car1;
//
//        Car car2 = new Car();
//        car2.changeGear('N');
//        carArray[1] = car2;
//
//        Car car3 = new Car();
//        car3.changeGear('D');
//        carArray[2] = car3;
//
//        for(Car car: carArray) {
//            System.out.println("car.gear = " +car.gear );
//        }





    }
}
