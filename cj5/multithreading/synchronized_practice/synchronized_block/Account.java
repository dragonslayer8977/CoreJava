package multithreading.synchronized_practice.synchronized_block;

class Account {
    private int balance = 1000;

    public void withdraw(int amount) {

        synchronized (this) {
            if (amount <= balance) {    // using synchronization block instead of synchronized method
                balance -= amount;
                System.out.println("Successfully withdrawn amount!");
                System.out.println("current balance: " + getBalance());
            }

        }

    }

    public int getBalance() {
        synchronized (this) {
            return this.balance;
        }
    }

}