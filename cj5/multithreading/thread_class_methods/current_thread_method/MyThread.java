package multithreading.thread_class_methods.current_thread_method;

public class MyThread extends Thread{

    @Override
    public void run(){

        try{

            System.out.println(Thread.currentThread().getName() + " thread execution started....");
            System.out.println("Current thread is in " + Thread.currentThread().getState() + " state");
            Thread.sleep(2000);
            System.out.println("Current thread is in " + Thread.currentThread().getState() + " state");
            System.out.println(Thread.currentThread().getName() + " thread execution completed!!");
            System.out.println("Current thread is in " + Thread.currentThread().getState() + " state");
        } catch (InterruptedException e) {
            System.err.println(e);
        }

    }

    static void main() {
        MyThread thread01 = new MyThread();

        System.out.println("Current thread is in " + thread01.getState() + " state"); // returns the state of the thread
        thread01.start();
        System.out.println("Current thread is in " + thread01.getState() + " state");
        Thread.currentThread().setName("Not-main"); // sets the name of the thread
        System.out.println("the currently running thread is " + Thread.currentThread().getName()); // gets the name of the thread
        System.out.println("the priority of the currently running thread is " + Thread.currentThread().getPriority()); // by default the priority of the newly created thread is 5 since the main thread always has a priority of 5
        // the thread that creates a new thread will always pass it's priority to child thread
        System.out.println("is the currently running thread interrupted: " + Thread.currentThread().isInterrupted()); // check the interrupted flag of the thread
        System.out.println(holdsLock(thread01)); // checks if the specified thread object has any locks
        System.out.println (thread01.getState ());

    }
}
