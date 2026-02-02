package strings;

public class StringBufferExample {

    // StringBuffer is similar to StringBuilder but is thread safe hence slower than StringBuilder

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer ();
        sb.append ("intern"); // adds
        sb.charAt (4);
        sb.setCharAt (5, 'z');
        sb.deleteCharAt (sb.length () - 1);
        sb.reverse ();
        sb.toString ();
        sb.deleteCharAt (3);
        sb.insert (6, "techouts");
    }
}
