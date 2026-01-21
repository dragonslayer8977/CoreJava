import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Question04 {


    public static void main(String[] args) {

        ArrayList<String> emails = new ArrayList<>();

        emails.add("rakesh.b@techouts.co.in");
        emails.add("mahesh.g@techouts.co.in");
        emails.add("mahesh.g@techouts.co.in");
        emails.add("shivaram.c.b@techouts.co.in");
        emails.add("shivaram.c.b@techouts.co.in");
        emails.add("shivaram.c.b@techouts.co.in");
        emails.add("manoj.k@techouts.co.in");
        emails.add("manoj.k@techouts.co.in");
        emails.add("manoj.k@techouts.co.in");
        emails.add("rakesk@gmail.com");
        emails.add("shivaram@gmail.com");
        emails.add("shivaram@gmail.com");
        emails.add("shivaram@gmail.com");
        emails.add("ganesh.k@techouts.co.in");
        emails.add("manoj@gmail.com");

        Set<String> set = new HashSet<>();
        emails.stream().filter((e) -> {

            if(set.contains(e) || !e.contains("techouts")) {
                return false;
            }
            set.add(e);
            return true;

        }).forEach((e) -> System.out.println(e));

//        output:
//              rakesh.b@techouts.co.in
//              mahesh.g@techouts.co.in
//              shivaram.c.b@techouts.co.in
//              manoj.k@techouts.co.in
//              ganesh.k@techouts.co.in

    }
}
