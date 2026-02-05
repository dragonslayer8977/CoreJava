package multithreading.inter_thread_communication;

public class Account {

    int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " has successfully deposited " + amount + " rupees!!");
        System.out.println("Thread " + Thread.currentThread().getName() + " has notified!!");
        notifyAll();
    }

    public synchronized void withdraw(int amount) {

        while (balance < amount) { // why not if condition because the wait() can might wakeup automatically (spurious wakeups) so everytime the thread wake up we check the condition again and again
            try {
                System.out.println("waiting for deposit...");
                System.out.println("Thread " + Thread.currentThread().getName() + " is waiting");
                wait();
            } catch (InterruptedException e) {
                System.err.println(e);
                return;
            }
        }

        balance -= amount;
        System.out.println(Thread.currentThread().getName() + "has successfully deduced " + amount + " rupees");
        System.out.println("Thread " + Thread.currentThread().getName() + " has completed execution");

    }


    public static void main() throws InterruptedException {

        Account a01 = new Account();

        Thread t1 = new Thread (new Runnable () {
            @Override
            public void run() {
                a01.withdraw(3000);
            }
        });
        t1.setName("withdraw_thread");

        Thread t2 = new Thread (new Runnable () {
            @Override
            public void run() {
                a01.deposit(10000); // using anonymous classes
            }
        });
        t2.setName("deposit_thread");


        t1.start();
//        t1.join();  // This will cause a deadlock like situation where "withdraw_thread" is in waiting state and main thread waits for "withdraw_thread" to complete its execution so "deposit_thread" is never started
        t2.start();

        t1.join();
        t2.join();

        System.out.println("current balance is: " + a01.balance);

    }


}
