package multithreading.threadclassmethods;

public class MyThread extends Thread{

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

    static void main() throws InterruptedException {

        MyThread thread01 = new MyThread("thread01");
        MyThread thread02 = new MyThread("thread02");
        MyThread thread03 = new MyThread("thread03");
        MyThread thread04 = new MyThread("thread04");
        MyThread thread05 = new MyThread("thread05");

        thread01.start(); // creates new thread and calls the run method internally
//        thread02.run(); // executes the code immediately no thread involved
        thread02.start();
        thread03.start();
        thread04.start();
        thread05.start();

        thread01.join();
        thread02.join();
        thread03.join();
        thread04.join();
        thread05.join();

        System.out.println("completely executed!!"); // without thread.join() this statement will execute immediately i.e., first


    }
}
