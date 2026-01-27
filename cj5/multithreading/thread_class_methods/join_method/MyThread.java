package multithreading.thread_class_methods.join_method;


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
        // internally the main thread calls thread01.join() and main thread waits for "thread01" to finish execution
        // "thread01" finishes execution and JVM notifies the main thread.
        // main thread resumes
        // join() throws InterruptedException which occurs in the waiting thread(in this case main thread) is interrupted
        // calling thread waits not the target thread(in this the calling thread is main thread and target thread is thread01)
        thread02.join();
        thread03.join();
        thread04.join();    // with the use of join() the main thread pauses until these threads complete their execution
        thread05.join(100);     // if the thread does not finish execution in 100ms, the waiting thread continues anyway

        System.out.println("completely executed!!"); // without thread.join() this statement will execute immediately i.e., first


    }
}
