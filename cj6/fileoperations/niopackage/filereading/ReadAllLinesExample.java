package fileoperations.niopackage.filereading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllLinesExample {

    public static void main(String[] args) {

        Path path = Paths.get ("cj6/fileoperations/examplefolder/example.txt");

        try{

            List<String> actualText = Files.readAllLines (path);
            for(String line: actualText) {

                System.out.println (line);
            }

        } catch (IOException e) {
            System.err.println (e);
        }

    }
}
