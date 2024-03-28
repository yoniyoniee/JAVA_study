package week03.includeExample;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("GV80", "Black", 50000000);

        Tire[] tires = new Tire[]{
                new Tire("KIA", 150000), new Tire("금호", 150000),
                new Tire("Samsung", 150000), new Tire("LG", 150000)
        };

        Door[] doors = new Door[] {
                new Door("LG", "FL"), new Door("KIA", "FR"),
                new Door("Samsung", "BL"), new Door("LG", "BR")
        };

        Handle handle = new Handle("Samsung", "S");

        //등록
        car.setTire(tires);
        car.setDoor(doors);
        car.setHandle(handle);

        //확인
        for(Tire tire: car.tire) {
            System.out.println(tire.company);
            System.out.println(tire.price);

        }

        for(Door door: car.door) {
            System.out.println(door.company);
            System.out.println(door.location);
        }

        System.out.println(car.handle.company);
        System.out.println(car.handle.type);

        car.handle.turnHandle("Right");

        Handle carHandle = car.handle;

        System.out.println(carHandle.company);
        System.out.println(carHandle.type);
        carHandle.turnHandle("Left");
    }
}
