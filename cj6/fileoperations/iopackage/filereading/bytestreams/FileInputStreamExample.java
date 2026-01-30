package fileoperations.iopackage.filereading.bytestreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// InputStream is the parent abstract class for all the class that read byte data.

public class FileInputStreamExample {

    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream ("cj6\\fileoperations\\examplefolder\\example.txt")){

            int b;
            while((b = fis.read ()) != -1){ // returns next byte of the data from input stream

                System.out.print ((char)b);

            }

        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
