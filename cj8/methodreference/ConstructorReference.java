package methodreference;

import java.util.function.Supplier;

public class ConstructorReference {

    ConstructorReference(){
        System.out.println ("constructor created");
    }

    public static void main(String[] args) {

        Supplier<ConstructorReference> supplier = ConstructorReference::new;

        supplier.get ();

    }
}
