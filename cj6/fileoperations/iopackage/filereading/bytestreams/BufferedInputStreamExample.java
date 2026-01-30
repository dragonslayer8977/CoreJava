package fileoperations.iopackage.filereading.bytestreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

    public static void main(String[] args) {

        try(BufferedInputStream bis = new BufferedInputStream (new FileInputStream ("cj6\\fileoperations\\examplefolder\\example.txt"))) {

            int b;
            while((b = bis.read ()) != -1) {
                System.out.print ((char)b);
            }

        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
