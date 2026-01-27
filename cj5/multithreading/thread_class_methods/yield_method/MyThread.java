package multithreading.thread_class_methods.yield_method;

// yield method is static so it only operates on the current running thread
// the current thread moves from running state to runnable state
// CPU maybe given to another runnable thread of same priority
// the behaviour dependent on JVM and OS thread scheduler

public class MyThread extends Thread{

    String threadName;

    MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Thread is running at " + i);
            Thread.yield();
        }
    }

    static void main() {

        MyThread thread01 = new MyThread("thread01");
        MyThread thread02 = new MyThread("thread02");

        thread01.start();
        thread02.start();
    }
}
