package thread;

public class Main {
    public static void main(String[] args) {
//        TestThread testThread = new TestThread();
//
//        testThread.start();

//        Runnable run = new TestRunnable();
//
//        Thread thread = new Thread( run);
//
//        thread.start();


        Runnable task = () -> {
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                System.out.println(i);
                sum += i;
            }

            System.out.println(Thread.currentThread().getName() + sum);
        };

        Thread thread1 = new Thread(task);
        thread1.setName("Thread1");
        Thread thread2 = new Thread(task);
        thread2.setName("Thread2");

        thread1.start();
        thread2.start();

    }
}
