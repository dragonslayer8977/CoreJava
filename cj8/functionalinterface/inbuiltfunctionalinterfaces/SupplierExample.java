package functionalinterface.inbuiltfunctionalinterfaces;

import java.util.UUID;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<String> supplier = new Supplier<String> () { // returns a value without any input
            // used for lazy generation of values
            @Override
            public String get() {
                return UUID.randomUUID ().toString ();
            }
        };

        Supplier<String> supplier1 = () -> UUID.randomUUID ().toString ();

        System.out.println (supplier.get ());
        System.out.println (supplier1.get ());

    }
}
