package multithreading.daemon_thread;

// daemon thread is a background running thread which provides services to other thread and does not stop the termination of the JVM.
// so even if multiple daemon threads are running the JVM will still exit and terminates those threads

public class DaemonThread extends Thread{

    @Override
    public void run() {
        while(true) {
            System.out.println("Deamon thread running...");
            try{
                Thread.sleep(100); // without this delay the daemon thread may run a few time even after the main thread is terminated
                // because only after main thread termination this thread is stopped, since there is a delay between knowing that the main thread has terminated
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }

    static void main() {
        DaemonThread t1 = new DaemonThread();
        t1.setDaemon(true); // sets t1 as a daemon thread
        t1.start();
        System.out.println("Main thread started execution...");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println(e);
        }

        System.out.println("Main thread completed execution!!");
    }
}
