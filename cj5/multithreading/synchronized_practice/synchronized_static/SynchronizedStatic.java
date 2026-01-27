package multithreading.synchronized_practice.synchronized_static;

public class SynchronizedStatic {

    static void main() {
        Bank b1 = new Bank();


        Customer c1 = new Customer(b1);
        Customer c2 = new Customer(b1);

        c1.start();
        c2.start();
    }
}
