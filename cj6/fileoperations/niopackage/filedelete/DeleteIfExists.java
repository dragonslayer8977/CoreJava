package fileoperations.niopackage.filedelete;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteIfExists {

    public static void main(String[] args) {
        Path path = Paths.get ("cj6/fileoperations/examplefolder/example.txt");

        try {
            if (Files.deleteIfExists (path)) {
                System.out.println ("File exists and has been deleted!!");
            } else {
                System.out.println ("File does not exists!!");
            }
        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
