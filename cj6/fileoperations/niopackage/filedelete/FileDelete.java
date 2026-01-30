package fileoperations.niopackage.filedelete;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class FileDelete {

    public static void main(String[] args) {
        Path path = Paths.get ("cj6/fileoperations/examplefolder/example.txt");

        try{

            Files.delete (path);
            System.out.println ("deleted successfully!");

        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
