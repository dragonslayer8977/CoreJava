package fileoperations.niopackage.filecopy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy {

    public static void main(String[] args) {

        Path txtPath = Paths.get ("cj6/fileoperations/examplefolder/example01/example.txt");
        Path mdPath = Paths.get ("cj6/fileoperations/examplefolder/example01/example.md");

        try {
            Files.copy (mdPath, txtPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println (e);
        }
    }
}


