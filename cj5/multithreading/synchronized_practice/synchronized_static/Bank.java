package multithreading.synchronized_practice.synchronized_static;

public class Bank {

    public static int balance = 1000;

    public static synchronized void withdraw(int amount) {
        if(amount > balance) {
            System.out.println("Invalid amount!");
            return;
        }

        balance -= amount;
        System.out.println("Successfully withdrawn!!");
        System.out.println("current balance is " + getBalance());
    }

    public static synchronized int getBalance() {
        return balance;
    }
}
