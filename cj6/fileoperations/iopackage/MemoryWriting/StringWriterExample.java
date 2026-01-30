package fileoperations.iopackage.MemoryWriting;

// a subclass of Writer that writes character data as string into the memory
// internally uses StringBuffer for thread safety

import java.io.IOException;
import java.io.StringWriter;

public class StringWriterExample {

    public static void main(String[] args) {

        try(StringWriter sw = new StringWriter ()){

            sw.write (new char[]{'m', 'a', 'h', 'e', 's', 'h'});

            System.out.println (sw);

        } catch (IOException e) {

            System.err.println (e);
        }
    }
}
