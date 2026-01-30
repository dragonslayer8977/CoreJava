package fileoperations.iopackage.filereading.bytestreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {

    public static void main(String[] args) {

        try(SequenceInputStream sis = new SequenceInputStream (new FileInputStream ("cj6\\fileoperations\\examplefolder\\example.txt"), new FileInputStream ("cj6\\fileoperations\\examplefolder\\example01\\example.md"))) { // used to read multiple files data as a single unit

            int b;
            while((b = sis.read ()) != -1) {
                System.out.print ((char)b);
            }

        } catch (IOException e) {
            System.err.println (e);
        }

    }
}
