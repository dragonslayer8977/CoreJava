package functionalinterface.inbuiltfunctionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> predicate = new Predicate<Integer> () { // takes input and returns boolean(predict)
            // has only one abstract method boolean test() used for conditional checking and filtering
            @Override
            public boolean test(Integer integer) {
                return integer > 10;
            }
        };

        Predicate<Integer> predicate1 = (integer) -> integer > 10;

        System.out.println (predicate.test (23));
        System.out.println (predicate1.test (3));
    }
}
