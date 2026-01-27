package multithreading.synchronized_practice.synchronized_static;

public class Customer extends Thread{

    Bank bank;
    Customer(Bank bank) {
        this.bank = bank;
    }
    @Override
    public void run() {
        Bank.withdraw(200);
        System.out.println(Thread.currentThread().getName());
    }
}
