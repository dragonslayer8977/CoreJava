package fileoperations.iopackage.filereading.characterstreams;

// Reader is the superclass for all the class that are used to read characters from the file

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {
        try(FileReader fr = new FileReader ("cj6\\fileoperations\\examplefolder\\example.txt")) {

            int c;
            while((c = fr.read ()) != -1) {
                System.out.print ((char)c);
            }


        } catch (IOException e) {
            System.err.println (e);
        }
    }

}
