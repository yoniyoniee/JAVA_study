package week03.poly;

public class Main {
    public static void main(String[] args) {

        Tire kiaSampleTire = new KiaTire("KIA");
        Tire hankookSampleTire = new HankookTire(("HANKOOK"));

        Car car1 = new Car(kiaSampleTire);
        Car car2 = new Car(hankookSampleTire);

        Tire hankookTire = car1.getHankookTire();
        Tire kiaTire = car2.getKiaTire();

        car1.tire.rideComfort();
        car2.tire.rideComfort();


    }
}
