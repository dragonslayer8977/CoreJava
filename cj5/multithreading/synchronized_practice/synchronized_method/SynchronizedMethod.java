package multithreading.synchronized_practice.synchronized_method;

// synchronized method locks the current object, ensuring only one thread can execute any synchronized method on the same object instance
// every object has a single lock
// synchronized method holds that lock
// the thread requires lock on the object, if the lock is free thread acquires it an enter the synchronized method
// to execute synchronized methods lock is required. and only one thread can access one lock so it is impossible for other threads to run the synchronized methods

// synchronized method: a synchronized method ensures that only one thread can execute it at any given time on the same instance object
// -- so if two threads tries to run the same synchronized method on the same object at the same time only thread can execute it(i.e., synchronized method)

public class SynchronizedMethod{

    static void main() {
        Account a01 = new Account();

        Customer c1 = new Customer(a01, "thread-01");
//        c1.setName("thread-01");
        Customer c2 = new Customer(a01, "thread-02");
//        c2.setName("thread-02");

        c2.start();
        c1.start();
    }


}
