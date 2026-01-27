package multithreading.thread_class_methods.run_method;

// run method contains the code the needs to executed inside the thread

public class MyThread extends Thread{

    String threadName;

    MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(this.threadName + " execution started...");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(this.threadName + " execution ended!!!");
    }

    static void main() {
        MyThread t1 = new MyThread("t1");
        MyThread t2 = new MyThread("t2");
        MyThread t3 = new MyThread("t3");
        MyThread t4 = new MyThread("t4");

        t1.run(); // this is not multithreading, this is just plain method calling on the main thread
        t2.run();
        t3.run();
        t4.run();
    }


}
