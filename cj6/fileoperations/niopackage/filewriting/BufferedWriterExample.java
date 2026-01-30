package fileoperations.niopackage.filewriting;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BufferedWriterExample {

    static void main(String[] args) {

        try(BufferedWriter bw = Files.newBufferedWriter (Paths.get ("cj6/fileoperations/examplefolder/example.txt"), StandardCharsets.UTF_8, StandardOpenOption.WRITE)) {
    // used for writing data line by line
            String str = """
                    public class Test{
                        public static void main(String[] args) {
                            System.out.println("Hello World!!!!!!!!!");
                        }
                    }
                    """;
            String cmtStr = "// This is the comment statement...";
            bw.write (str);
            bw.newLine (); // creates a new empty line
            bw.write (cmtStr);

        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
