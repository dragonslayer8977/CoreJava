import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Question04 {


    public static void main(String[] args) {

        ArrayList<String> emails = new ArrayList<>();

        emails.add("rakesh.b@tout.co.in");
        emails.add("mahesh.g@tout.co.in");
        emails.add("mahesh.g@tout.co.in");
        emails.add("shivaram.c.b@tout.co.in");
        emails.add("shivaram.c.b@tout.co.in");
        emails.add("shivaram.c.b@tout.co.in");
        emails.add("manoj.k@tout.co.in");
        emails.add("manoj.k@tout.co.in");
        emails.add("manoj.k@tout.co.in");
        emails.add("rakesk@gmail.com");
        emails.add("shivaram@gmail.com");
        emails.add("shivaram@gmail.com");
        emails.add("shivaram@gmail.com");
        emails.add("ganesh.k@tout.co.in");
        emails.add("manoj@gmail.com");

        Set<String> set = new HashSet<>();
        emails.stream().filter((e) -> {

            if(set.contains(e) || !e.contains("tout")) {
                return false;
            }
            set.add(e);
            return true;

        }).forEach((e) -> System.out.println(e));

//        output:
//              rakesh.b@tout.co.in
//              mahesh.g@tout.co.in
//              shivaram.c.b@tout.co.in
//              manoj.k@tout.co.in
//              ganesh.k@tout.co.in

    }
}
