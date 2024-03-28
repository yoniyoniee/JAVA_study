package week03.superExample;



public class Main {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Orion");

        System.out.println("sportsCar.model = " + sportsCar.model);
        System.out.println("sportsCar.color = " + sportsCar.color);
        System.out.println("sportsCar.price = " + sportsCar.price);
        System.out.println();

        sportsCar.setCarInfo("GV80", "Black", 50000000);

        System.out.println("sportsCar.price = " + sportsCar.price);
        System.out.println();

        System.out.println("sportsCar.model = " + sportsCar.model);
        System.out.println("sportsCar.color = " + sportsCar.color);
        System.out.println();

        System.out.println("sportsCar.getModel() = " + sportsCar.getModel());
        System.out.println("sportsCar.getColor() = " + sportsCar.getColor());
    }

}
