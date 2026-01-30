package fileoperations.iopackage.filewriting.characterstreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileWriterExample {

    static void main(String[] args) {

        try(BufferedWriter bos = new BufferedWriter (new FileWriter ("cj6\\fileoperations\\examplefolder\\example.txt", true))) { // buffers characters output for better performance and reduces IO calls

            bos.write("This is the content written using \"BufferedWriter\"");


        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
