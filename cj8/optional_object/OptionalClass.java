package optional_object;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

// Optional class enables developers handle the NullPointerException gracefully


public class OptionalClass {

    public static void main(String[] args) {

        Optional<Integer> optionalInt = Optional.empty (); // assigns a null value

        try {
            System.out.println (optionalInt.get ()); // throws an exception since the value of optionalInt is null
        } catch (NoSuchElementException e) {
            System.err.println (e);
        }

        optionalInt = Optional.ofNullable (3435); // used to assign value but the value can also be a null
        System.out.println (optionalInt.get ()); // this will return the specified value

        optionalInt = Optional.ofNullable (null);
        optionalInt.ifPresent (System.out::println); // if the value is not null then perform the consumer action

        ;
        System.out.println (optionalInt.orElse (-1));

        int i = optionalInt.orElseGet (
//                new Supplier<Integer> () {
//                    @Override
//                    public Integer get() {
//                        return new Integer (34);
//                    }
//                }
                () -> Integer.valueOf (-1)
        );
        System.out.println (i);



    }

}
