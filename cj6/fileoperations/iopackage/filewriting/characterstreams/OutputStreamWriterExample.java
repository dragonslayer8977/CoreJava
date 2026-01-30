package fileoperations.iopackage.filewriting.characterstreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

// OutputStreamWriter is used to convert the characters into bytes using character encoding and writing those bytes into the file.

public class OutputStreamWriterExample {

    public static void main(String[] args) {
        try(OutputStreamWriter osw = new OutputStreamWriter (new FileOutputStream ("cj6\\fileoperations\\examplefolder\\example.txt", true), StandardCharsets.UTF_8)) {

            osw.write("This is the content written using \"OutputStreamWriter\"");
            osw.write("This is the content written using \"OutputStreamWriter\"");

        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
