package multithreading.priority_mainpulation;

public class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("currently running thread is: " + Thread.currentThread().getName() + " of priority " + Thread.currentThread().getPriority());
    }

    static void main() {
        Thread t00 = new Thread(new MyThread());
        Thread t01 = new Thread(new MyThread());
        Thread t02 = new Thread(new MyThread());

        t00.setPriority(5);  // t00.setPriority(Thread.NORM_PRIORITY)
        t02.setPriority(10); // t02.setPriority(Thread.MAX_PRIORITY)
        t01.setPriority(1);  // t01.setPriority(Thread.MIN_PRIORITY)

        t00.start();
        t01.start();
        t02.start();
    }
}
