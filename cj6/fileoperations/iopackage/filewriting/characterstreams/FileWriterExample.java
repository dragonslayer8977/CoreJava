package fileoperations.iopackage.filewriting.characterstreams;

import java.io.FileWriter;
import java.io.IOException;

// Writer class is the parent abstract class for all the class that are used to write character data to the files
// Writer provides methods such as write, close and flush to its child classes

public class FileWriterExample {

    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter ("cj6\\fileoperations\\examplefolder\\example.txt", true)) { // writes characters directly to the file. if file is not present then will automatically create the file, generally used for large text write operations

            String inputStr = """ 
                    {
                        "date": "1999-12-12",
                        "id": 23
                    }
                    """; // text block
            fw.write (inputStr);

        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
