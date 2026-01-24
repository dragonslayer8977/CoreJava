package multithreading.threadcreation.runnableinterface;

public class MyThread implements Runnable {

    String threadName;

    MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        printSomething();
    }


    public void printSomething() {

        System.out.println(this.threadName + " running....");

        try {
            Thread.sleep(3000); // 3 sec

            System.out.println(this.threadName + " execution completed!!");
        } catch (InterruptedException e) {
            System.err.println(e);
        }
    }

    static void main() {

        Thread thread01 = new Thread(new MyThread("thread01"));
        Thread thread02 = new Thread(new MyThread("thread02"));
        Thread thread03 = new Thread(new MyThread("thread03"));
        Thread thread04 = new Thread(new MyThread("thread04"));
        Thread thread05 = new Thread(new MyThread("thread05"));

        thread01.start();  // creates the thread and calls run() internally
        thread01.run();  // this will run the code instantly like a method call so this is not a thread
        thread02.start();
        thread03.start();
        thread04.start();
        thread05.start();
    }
}
