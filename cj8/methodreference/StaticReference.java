package methodreference;

import java.util.UUID;
import java.util.function.Function;
import java.util.function.Supplier;

public class StaticReference {

    public static void main(String[] args) {

        Supplier<UUID> supplier = UUID::randomUUID; // returns a UUID
        System.out.println (supplier.get ().toString ()); // converting UUID to string

    }
}
