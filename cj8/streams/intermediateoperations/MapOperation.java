package streams.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapOperation {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList (2,4,6,8,9,5,3,12,4,6,8,5,43);
//
//        Stream<Integer> stream = list.stream ();
//
//        stream.map (new Function<Integer, Integer> () { // returns a stream that consists of modified elements after applying the function, stateless operation
//            // uses Function interface to map values
//            @Override
//            public Integer apply(Integer integer) {
//                return integer * integer;
//            }
//        }).forEach (new Consumer<Integer> () {
//            @Override
//            public void accept(Integer integer) {
//                System.out.print (integer + " ");
//            }
//        });

        Arrays.asList (2,4,6,8,9,5,3,12,4,6,8,5,43)
                .stream ()
                .map (i -> i * i)
                .forEach (System.out::println);

    }
}
