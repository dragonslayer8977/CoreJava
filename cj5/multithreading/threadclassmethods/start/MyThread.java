package multithreading.threadclassmethods.start;

// creates new thread and calls the "run" method internally to run the code

public class MyThread extends Thread {


    String threadName;

    MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {


        System.out.println(this.threadName + " execution started....");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println(this.threadName + " execution completed....");

    }

    static void main() {
        Thread t1 = new MyThread("thread01");
        Thread t2 = new MyThread("thread02");
        Thread t3 = new MyThread("thread03");
        Thread t4 = new MyThread("thread04");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
