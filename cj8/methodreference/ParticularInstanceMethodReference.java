package methodreference;

import java.util.function.Consumer;

public class ParticularInstanceMethodReference {

    public static void main(String[] args) {

        Consumer<String> consumer = System.out::println;
        consumer.accept ("String");

    }
}
