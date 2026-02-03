package streams.intermediateoperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedExample {

    public static void main(String[] args) {


//        List<Integer> list = Arrays.asList (4, 6, 8, 9, 2, 23, 547, 96, 70, 54, 345, 2, 6867, 9, 68, 56, 2, 5, 3, 35, 7, 56, 84, 7, 35);
//
//        Stream<Integer> stream = list.stream ();
//
//        stream.sorted (new Comparator<Integer> () { // sorts the values based on the Comparator compare method, stateful operation
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        }).forEach (n -> System.out.println (n));

        Arrays.asList (4, 6, 8, 9, 2, 23, 547, 96, 70, 54, 345, 2, 6867, 9, 68, 56, 2, 5, 3, 35, 7, 56, 84, 7, 35)
                .stream ()
                .sorted ()
                .forEach (System.out::println);
    }
}
