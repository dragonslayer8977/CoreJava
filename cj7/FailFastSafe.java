import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastSafe {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList (6, 7, 8, 9, 4, 2, 54, 87, 79, 98, 54, 23, 234, 5, 65, 679, 78, 89, 0, 80, 7, 8, 456, 43, 2, 34, 234, 23);

        Iterator<Integer> it = list.iterator ();

        while (it.hasNext ()) {

            System.out.print (it.next () + " ");
//            list.add(4554);
//            list.remove (5); // fail fast iterator throws an exception immediately if the collection has modified after the creation of iterators

        }


        System.out.println ();


        List<Integer> threadSafeList = new CopyOnWriteArrayList<> (Arrays.asList (6, 7, 8, 9, 4, 2, 54, 87, 79, 98, 54, 23, 234, 5, 65, 679, 78, 89, 0, 80, 7, 8, 456, 43, 2, 34, 234, 23));

        Iterator<Integer> it1 = list.iterator ();

        while(it1.hasNext ()) {

            System.out.print (it1.next () + " ");

            threadSafeList.add (4545); // fail-safe iterator since the iterator is operating on the copy of the arraylist not on the actual arraylist so no exception is thrown

        }
    }
}
