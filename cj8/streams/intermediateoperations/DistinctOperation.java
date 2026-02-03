package streams.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


// Intermediate operations returns a stream
// only executes when there is a terminal operation at the end of the chain of intermediate operations hence they are "lazy"

// stateless operation of the operation outcome does not depend on the outcome of the previous elements
// stateful if the operation outcome depends on the previous operation outcome
// short-circuited if there is a chance that operation might not process all elements in the stream and terminate midway

public class DistinctOperation {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList (4, 6, 8, 9, 2, 23, 547, 96, 70, 54, 345, 2, 6867, 9, 68, 56, 2, 5, 3, 35, 7, 56, 84, 7, 35, 2, 4, 6, 8, 9, 5, 3, 12, 4, 6, 8, 5, 43, 45, 64, 5, 45, 7, 47, 4, 756, 8, 56, 8, 57, 8, 7, 9, 79, 35, 435, 23, 5, 4, 5, 6);
//
//        Stream<Integer> stream = list.stream ();
//
//        stream.distinct () // removes duplicate elements from the streams internally used equals() method. it is a stateful operation since the output of an element depends on the previous elements (check if the element is already seen)
//        .forEach (new Consumer<Integer> () {
//            @Override
//            public void accept(Integer i) {
//                System.out.println (i);
//            }
//        });


        Arrays.asList (4, 6, 8, 9, 2, 23, 547, 96, 70, 54, 345, 2, 6867, 9, 68, 56, 2, 5, 3, 35, 7, 56, 84, 7, 35, 2, 4, 6, 8, 9, 5, 3, 12, 4, 6, 8, 5, 43, 45, 64, 5, 45, 7, 47, 4, 756, 8, 56, 8, 57, 8, 7, 9, 79, 35, 435, 23, 5, 4, 5, 6)
                .stream ()
                .distinct ()
                .forEach (System.out::println);

    }
}
