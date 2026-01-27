package multithreading.synchronized_practice.synchronized_block;


class Customer extends Thread {

    Account account;
    Customer(Account account, String name) {
        super(name); // sets the name of the thread
        this.account = account;
    }

    @Override
    public void run() {
        account.withdraw(200);
        System.out.println(Thread.currentThread().getName());

    }
}
