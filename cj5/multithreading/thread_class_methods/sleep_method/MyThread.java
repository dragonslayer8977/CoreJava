package multithreading.thread_class_methods.sleep_method;

public class MyThread extends Thread {

    String threadName;

    MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(this.threadName + " execution started...");

        try{

            Thread.sleep(2000); // sleep() pauses the execution of the current running thread for a specified period of time,
            // since it is a static method it only affects the current running thread and also does not release any locks
            // sleep() throws InterruptedException

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.threadName + " execution ended!!!");
    }
}
