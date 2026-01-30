package fileoperations.iopackage.MemoryWriting;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// ByteArrayOutputStream is a subclass of OutputStream that enables to write data to the memory instead of files.

public class ByteArrayOutputStreamExample {

    public static void main(String[] args) {

        try(ByteArrayOutputStream baos = new ByteArrayOutputStream ()) {

            baos.write ("Mahesh".getBytes ()); // creating a byte array that represents the characters of the string in bytes and writing that data to the memory
            // generally used to store data that is reused often to reduce IO calls on the OS

            FileOutputStream fos = new FileOutputStream ("cj6\\fileoperations\\examplefolder\\example.txt");
            fos.write (baos.toByteArray ()); // writing the data to file
            fos.close ();
            System.out.println (new String(baos.toByteArray ())); // logging that data to the terminal or we can send that data over network

        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
