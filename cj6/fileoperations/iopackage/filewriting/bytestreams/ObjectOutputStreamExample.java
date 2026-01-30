package fileoperations.iopackage.filewriting.bytestreams;

import java.io.*;

// serialization the process of converting java object into byte stream so that they can be written on to a file, or can be sent over a network or so they can stored inside a database

public class ObjectOutputStreamExample {

    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream ("cj6\\fileoperations\\examplefolder\\example.txt", true))) { // serializes the Java object into bytes

            oos.writeObject (new Response ("https://api.unsplash.com/", 200, "GET"));
            oos.writeObject (new Response ("https://api.unsplash.com//collections", 401, "POST"));

        } catch (IOException e) {
            System.err.println (e);
        }
    }
}
