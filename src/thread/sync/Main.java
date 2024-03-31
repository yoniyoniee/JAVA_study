package thread.sync;

public class Main {
    public static void main(String[] args) {

        AppleStore appleStore = new AppleStore();

        Runnable task = () -> {

            while(appleStore.getApple() > 0) {
                appleStore.eatApple();
                System.out.println(Thread.currentThread().getName() +appleStore.getApple());
            }
        };

        for (int i = 0; i<3; i++){
            Thread thread = new Thread(task);
            thread.setName("thread"+i);
            thread.start();
        }
    }
}

class AppleStore{

    private int storedApple = 10;

    public int getApple(){
        return this.storedApple;
    }

    public void eatApple() {

        synchronized (this) {
            if( storedApple > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    storedApple -= 1;
                }
            }
        }
    }

}
