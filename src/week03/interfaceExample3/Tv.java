package week03.interfaceExample3;

public class Tv {

    private String company;
    private int channel = 1;
    private int volume = 0;
    private boolean power = false;

    public Tv(String company){
        this.company = company;
    }

    public void displayPower(String company, boolean power){
        if (power) {
            System.out.println(company + " tv on");
        } else {
            System.out.println(company + " tv off");
        }

    }

    public void displayChannel(int channel) {
        System.out.println(("현재 채널 " + channel));
    }

    public void displayVolume(int volume) {
        System.out.println("현재 볼륨 " + volume);
    }

    public String getCompany() {
        return company;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isPower() {
        return power;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

}
