package week03.poly;

public class Tire {
    String company;

    public Tire(String company) {
        this.company = company;
    }

    public void rideComfort() {
        System.out.println(company + " 타이어 승차감은?");
    }
}
