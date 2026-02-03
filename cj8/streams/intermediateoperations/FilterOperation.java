package streams.intermediateoperations;

import java.util.Arrays;



public class FilterOperation {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList (4, 6, 8, 9, 2, 23, 547, 96, 70, 54, 345, 2, 6867, 9, 68, 56, 2, 5, 3, 35, 7, 56, 84, 7, 35);
//
//        list.stream ().filter (new Predicate<Integer> () { // decides whether to include the element in the resultant stream based on the passed Predicate value, filter is a stateless operation since the output of the element only depends on itself but not on other elements in the stream
//            @Override
//            public boolean test(Integer integer) {
//                return (integer & 1) == 0;
//            }
//        }).forEach (n -> System.out.print (n + " "));


        Arrays.asList (4, 6, 8, 9, 2, 23, 547, 96, 70, 54, 345, 2, 6867, 9, 68, 56, 2, 5, 3, 35, 7, 56, 84, 7, 35)
                .stream ()
                .filter (i -> (i&1) == 0)
                .forEach (System.out::println);


    }
}
