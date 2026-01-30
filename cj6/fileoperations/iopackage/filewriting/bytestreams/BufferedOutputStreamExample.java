package fileoperations.iopackage.filewriting.bytestreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class BufferedOutputStreamExample {

    public static void main(String[] args) {
        try (BufferedOutputStream bos = new BufferedOutputStream (new FileOutputStream ("cj6\\fileoperations\\examplefolder\\example.txt", true))) { // internally uses FileOutputStream, add a buffer for better performance

            bos.write (new byte[]{(byte) 'm', (byte) 'a', (byte) 'h', (byte) 'e', (byte) 's', (byte) 'h'}); // write data at once, so less IO calls

        } catch (IOException e) {

            System.err.println (e);
        }
    }
}
