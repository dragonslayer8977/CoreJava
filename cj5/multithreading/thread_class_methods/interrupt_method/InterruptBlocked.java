package multithreading.thread_class_methods.interrupt_method;

public class InterruptBlocked extends Thread{

    @Override
    public void run() {

        try{
            System.out.println("Thread started execution...");
            while(!Thread.currentThread().isInterrupted()) {
                System.out.println("thread is running.....");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.err.println("Thread was interrupted");
            System.err.println(e);
        }
    }

    static void main() throws InterruptedException{
        InterruptBlocked obj = new InterruptBlocked();
        obj.start();
        Thread.sleep(4000);
        obj.interrupt();
    }
}
