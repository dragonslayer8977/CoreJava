package multithreading.threadclassmethods.sleep;

public class MyThread extends Thread {

    String threadName;

    MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(this.threadName + " execution started...");

        try{

            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.threadName + " execution ended!!!");
    }
}
