package functionalinterface.inbuiltfunctionalinterfaces;

import java.util.function.Function;

public class functionExample {

    public static void main(String[] args) {

        Function<String, String> function = new Function<String, String> () { // takes input and returns output
            // has only apply() method and used for transforming data
            @Override
            public String apply(String s) {
                return s.toUpperCase ();
            }
        };

        Function<String, String> function1 = (s) -> s.toUpperCase ();

        System.out.println (function.apply ("this is a sentence that contains all lowercase letters"));
        System.out.println (function1.apply ("this is a sentence that contains all lowercase letters"));

    }
}
