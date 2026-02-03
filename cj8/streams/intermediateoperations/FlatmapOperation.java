package streams.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatmapOperation {

    public static void main(String[] args) {

//        List<List<Integer>> list = Arrays.asList (
//                Arrays.asList (4, 6, 8, 9, 2, 23, 547, 96, 70, 54, 345, 2, 6867, 9, 68, 56, 2, 5, 3, 35, 7, 56, 84, 7, 35),
//                Arrays.asList (2,4,6,8,9,5,3,12,4,6,8,5,43),
//                Arrays.asList (45,64,5,45,7,47,4,756,8,56,8,57,8,7,9,79,35,435,23,5,4,5,6)
//        );
//
//        Stream<List<Integer>> stream = list.stream ();
//
//        stream.flatMap (new Function<List<Integer>, Stream<Integer>> () { // converts a stream of collections into a stream of elements, stateless operation
//            @Override
//            public Stream<Integer> apply(List<Integer> list) {
//                return list.stream ();
//            }
//        }).forEach (n -> System.out.print (n + ", "));


        Arrays.asList (
                Arrays.asList (4, 6, 8, 9, 2, 23, 547, 96, 70, 54, 345, 2, 6867, 9, 68, 56, 2, 5, 3, 35, 7, 56, 84, 7, 35),
                Arrays.asList (2,4,6,8,9,5,3,12,4,6,8,5,43),
                Arrays.asList (45,64,5,45,7,47,4,756,8,56,8,57,8,7,9,79,35,435,23,5,4,5,6)
        )
                .stream ()
                .flatMap (List::stream)
                .forEach (System.out::println);

    }
}
