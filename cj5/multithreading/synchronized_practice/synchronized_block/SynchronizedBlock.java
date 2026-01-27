package multithreading.synchronized_practice.synchronized_block;

// synchronization is the mechanism that ensures that only one thread access the shared resources(methods, variable and objects) at any give time
// synchronization is necessary for
//      - prevent data inconsistency(caused by simultaneous data manipulation by multiple threads)
//      - avoid race condition: where multiple threads access shared resource simultaneously and perform data modification,
//          but the final result depends on the timing of their execution
//      - ensure data integrity(correctness of the data)


// synchronized block: instead of synchronizing an entire method Java allows us to synchronize a critical block of code that might cause data inconsistency if executed simultaneously
// -- just synchronize what is necessary


public class SynchronizedBlock{

    static void main() {
        Account a01 = new Account();

        Customer c1 = new Customer(a01, "thread-01");

        Customer c2 = new Customer(a01, "thread-02");

        c2.start();
        c1.start();
    }

}
