package strings;

public class StringMethods {

    public static void main(String[] args) {

        String s = "    mahesh   ";

        System.out.println ("original string: " + s);

        System.out.println ("trim: " + s.trim ());

        System.out.println ("Lower case: " + s.toLowerCase ());

        System.out.println ("Upper case: " + s.toUpperCase ());

        System.out.print ("character array: ");
        for(char c: s.toCharArray ()) {
            System.out.print (c + ", ");
        }
        System.out.println ();

        System.out.println ("mahesh".equals (s));

        System.out.println ("Mahesh".equalsIgnoreCase (s.trim ()));

        String sentence = "this is a sentence for testing split method";

        for(String str : sentence.split (" ")) {
            System.out.println (str);
        }

        System.out.println (sentence.replace ('e', 'E'));

    }
}
