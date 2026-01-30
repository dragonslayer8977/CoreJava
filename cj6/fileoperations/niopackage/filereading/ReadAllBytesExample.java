package fileoperations.niopackage.filereading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadAllBytesExample {

    public static void main(String[] args) {
        Path path = Paths.get("cj6/fileoperations/examplefolder/example.txt");

        try{

//            byte[] text = Files.readAllBytes (path);
//            String actualText = new String (text);
//            System.out.println (actualText);

            System.out.println (new String(Files.readAllBytes (path)));

        } catch (IOException e) {
            System.err.println (e);
        }

    }
}
