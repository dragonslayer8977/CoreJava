package streams.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class PeekOperation {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList (2,4,6,8,9,5,3,12,4,6,8,5,43);
//
//        Stream<Integer> stream = list.stream ();
//
//        stream.peek ( // performs the operation on the elements of the stream without modifying the stream itself and returns the same stream, stateless operation
//                new Consumer<Integer> () {
//                    @Override
//                    public void accept(Integer i) {
//                        System.out.print (i + " ");
//                    }
//                }
//        ).forEach (
//                new Consumer<Integer> () {
//                    @Override
//                    public void accept(Integer i) {
//                        System.out.print (i + " ");
//                    }
//                }
//        );

        Arrays.asList (2,4,6,8,9,5,3,12,4,6,8,5,43)
                .stream ()
                .peek (System.out::println)
                .forEach (System.out::println);

    }
}
