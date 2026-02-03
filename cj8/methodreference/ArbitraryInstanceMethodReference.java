package methodreference;

import java.util.function.Function;

public class ArbitraryInstanceMethodReference {

    public static void main(String[] args) {

        Function<String, String> function = String::toUpperCase;
        System.out.println (function.apply ("String"));

    }
}
