package fileoperations.iopackage.filereading.bytestreams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamExample {

    public static void main(String[] args) {
        try(DataInputStream dis = new DataInputStream (new FileInputStream ("cj6\\fileoperations\\examplefolder\\example.txt"))) { // reads java primitive types written using DataOutputStream

            System.out.println (dis.readInt ());
            System.out.println (dis.readLong ());
            System.out.println (dis.readBoolean ());
            System.out.println (dis.readUTF ());

        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
