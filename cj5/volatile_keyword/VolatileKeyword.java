package volatile_keyword;

// volatile is variable modifier used to guarantee the visibility of the change of a variable across multiple threads


// volatile keyword ensures that the latest value is always read from the main memory and not from thread's local cached memory
// in java threads may cache variables locally for performance, volatile prevents this behaviour
public class VolatileKeyword {

    static void main() throws InterruptedException {
        TrafficSignal signal = new TrafficSignal();
        Car car01 = new Car(signal);
        car01.start();

        Thread.sleep(1000);
        System.out.println("Traffic light turned green!!!");
        signal.greenLight = true;
    }


}

class TrafficSignal {
    public volatile boolean greenLight = false; // without this volatile keyword the thread would never
    // know about the change made to the signal variable and might have struck inside an infinite loop
}

class Car extends Thread {

    private TrafficSignal signal;

    Car(TrafficSignal signal) {
        this.signal = signal;
    }

    @Override
    public void run() {
        System.out.println("car is waiting....");
        while(!signal.greenLight) {
            System.out.println("not greenlight...");
        }
        System.out.println("greenlight appeared!!!");
    }
}
