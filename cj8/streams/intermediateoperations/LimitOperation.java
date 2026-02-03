package streams.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LimitOperation {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList (2,4,6,8,9,5,3,12,4,6,8,5,43);
//
//        Stream<Integer> stream = list.stream ();
//
//        stream.limit (6).forEach (n -> System.out.println (n)); // used to limit the number of elements that should be processes in the stream
        // useful in case of infinite streams

        Arrays.asList (2,4,6,8,9,5,3,12,4,6,8,5,43)
                .stream ()
                .limit (6)
                .forEach (System.out::println);

    }

}
