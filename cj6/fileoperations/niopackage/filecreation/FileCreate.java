package fileoperations.niopackage.filecreation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Path represents a file or directory location in the file system. replacement for "File" class in IO package
// Paths class provide a static method to create a Path instance since the Path class is a utility class
// Files class contains utility static methods for file and directory operations such as reading, writing, copying etc...

public class FileCreate {

    public static void main(String[] args) {

        Path path = Paths.get ("cj6//fileoperations//examplefolder//example.txt");
        try {

            Files.createFile (path);

        } catch (IOException e) {
            System.err.println (e);
        }

    }
}
