package week05.thread.group;

public class Main {
    public static void main(String[] args) {

        Runnable task = () -> {
            while(!Thread.currentThread().isInterrupted()) {
                try{
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                }
                catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName() + "Interrupt");
        };


        ThreadGroup group1 = new ThreadGroup("Group1");

        Thread thread1 = new Thread(group1, task, "thread1");
        Thread thread2 = new Thread(group1, task, "thread2");

        thread1.start();
        thread2.start();

        try{
            Thread.sleep(5000);
            //System.out.println(Thread.currentThread().getName());
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        group1.interrupt();
    }
}
