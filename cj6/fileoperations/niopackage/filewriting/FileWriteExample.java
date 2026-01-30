package fileoperations.niopackage.filewriting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteExample {

    public static void main(String[] args) {

        Path path = Paths.get ("cj6/fileoperations/examplefolder/example.txt");

        try {

            Files.write (path, "Mahesh".getBytes ()); // creates the file it the file does not exist

        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
