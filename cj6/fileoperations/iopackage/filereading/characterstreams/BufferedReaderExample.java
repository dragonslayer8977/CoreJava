package fileoperations.iopackage.filereading.characterstreams;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) {

        try(BufferedReader bis = new BufferedReader (new FileReader ("cj6\\fileoperations\\examplefolder\\example.txt"))) { // add buffering for better performance and can read line by line since each line is buffered at once

            String sentence;
            while((sentence = bis.readLine ()) != null) {
                System.out.println (sentence);
            }

        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
