package fileoperations.iopackage.filewriting.bytestreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// OutputStream is an abstract class that is the parent class for all byte stream related classes that are used to write bytes to the file
// provides methods write and close

// used for raw data writing to files
// raw data in the sense image, video files etc...

public class FileOutputStreamExample {

    public static void main(String[] args) {

        try (FileOutputStream fos01 = new FileOutputStream ("cj6\\fileoperations\\examplefolder\\example.txt");
             FileOutputStream fos02 = new FileOutputStream ("cj6\\fileoperations\\examplefolder\\example.txt", true)) {// append mode is when the data is written to the end of the file rather than overriding the beginning content of the file(just the first line)

            // writing byte by byte
            fos01.write ((byte)'m');
            fos01.write ((byte)'a');
            fos01.write ((byte)'h');
            fos01.write ((byte)'e');      // using explicit type conversion
            fos01.write ((byte)'s');
            fos01.write ((byte)'h');

            fos02.write ("MAHESH".getBytes ());

        } catch(IOException e) {
            System.err.println (e);
        }

    }
}
