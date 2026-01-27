package multithreading.synchronized_practice.synchronized_method;

class Account {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if(amount > balance) {
            System.out.println("Invalid balance!");
            return;
        }

        balance -= amount;
        System.out.println("Successfully withdrawn amount!");
        System.out.println("current balance: " + getBalance());
    }

    public synchronized int getBalance() {
        return this.balance;
    }

}
