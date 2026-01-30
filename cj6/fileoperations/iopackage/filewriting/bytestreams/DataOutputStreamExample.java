package fileoperations.iopackage.filewriting.bytestreams;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {

    public static void main(String[] args) {

        try(DataOutputStream dos = new DataOutputStream (new FileOutputStream ("cj6\\fileoperations\\examplefolder\\example.txt", true))) {

            dos.writeInt (Integer.MAX_VALUE);
            dos.writeLong (Long.MAX_VALUE);
            dos.writeBoolean (true);
            dos.writeUTF ("Mahesh");

        } catch(IOException e) {
            System.err.println (e);
        }
    }
}
