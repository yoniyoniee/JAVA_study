package week05.thread;

public class TestThread extends Thread{
    @Override
    public void run() {
        // 실제 우리가 실행해야할 작
        System.out.println("테스트!!");

        for(int i=0; i<100; i++) {
            System.out.printf("*");
        }
    }
}
