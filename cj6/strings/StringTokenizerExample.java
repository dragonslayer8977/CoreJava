package strings;

import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {

        // StringTokenizer is a legacy utility class that is used to split the string into tokens
        // modern java uses split() method.
        StringTokenizer st = new StringTokenizer ("this is a sentence string!!");

        st.countTokens ();

        while (st.hasMoreTokens ()) {
            System.out.println (st.nextToken ());
        }
    }
}
