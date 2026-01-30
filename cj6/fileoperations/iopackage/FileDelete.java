package fileoperations.iopackage;

import java.io.File;

public class FileDelete {

    public static void main(String[] args) {
        File file = new File ("cj6/fileoperations/examplefolder/example.txt");
        if(file.delete ()) {
            System.out.println ("file deleted successfully");
        } else {
            System.out.println ("there might not be a file to begin with");
        }

    }
}
