package week03.includeExample;

public class Car {

   static final String company = "GENESIS";
   String model;
   String color;
   double price;

   double speeds;
   char gear = 'P';
   boolean lights;

   Tire[] tire;
   Door[] door;
   Handle handle;

   public Car(String model, String color, double price) {
       this.model = model;
       this.color = color;
       this.price = price;
   }

   public void setTire(Tire ...tire) {
       this.tire = tire;
   }

   public  void setDoor(Door ...door) {
       this.door = door;
   }

   public void setHandle(Handle handle) {
       this.handle = handle;
   }

   public double gasPedal(double kmh, char type) {
       changeGear(type);
       this.speeds = kmh;

       return this.speeds;
   }

   public void changeGear(char type) {
       this.gear = type;
   }

   public boolean onOffLights() {
       lights = !lights;

       return lights;
   }

   public void horn() {
       System.out.println("빵");
   }
}
