package multithreading.thread_class_methods.interrupt_method;

// interrupt is cooperative not forceful
// set the interrupted flag to true
// if the target thread is in joining, sleeping or waiting, InterruptedException is thrown immediately.
// otherwise thread stops it's execution gracefully i.e., the thread should be able to stop itself in a sustainable manner
// thread does not stop execution immediately just the interrupted flag is set to true the remaining depends on what thread is doing
// like if the thread is in waiting, sleeping or joining state an InterruptedException is thrown immediately
// if the thread is running normally nothing would happen if the thread does not handle or check the thread manually

public class InterruptRunning extends Thread {

    String threadName;

    InterruptRunning(String threadName) {
        this.threadName = threadName;
    }


    @Override
    public void run() {

        System.out.println("Thread started execution....");
        while (!Thread.currentThread().isInterrupted()) {

            System.out.println("Thread is running.....");
        }
        System.out.println("Thread was interrupted.....");

    }

    static void main() {
        InterruptRunning obj = new InterruptRunning("t1");
        obj.start();
        obj.interrupt();
    }
}
