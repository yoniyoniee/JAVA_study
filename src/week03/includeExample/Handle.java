package week03.includeExample;

public class Handle {
    String company;
    String type;

    public Handle(String company, String type) {
        this.company = company;
        this.type = type;
    }

    public void turnHandle(String direction) {
        System.out.println(direction + " 방향으로 핸들 돌아갑니다");
    }
}
