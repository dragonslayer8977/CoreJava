package fileoperations.iopackage.filereading.bytestreams;

import fileoperations.iopackage.filewriting.bytestreams.Response;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {

    public static void main(String[] args) {

        try(ObjectInputStream ois = new ObjectInputStream (new FileInputStream ("cj6\\fileoperations\\examplefolder\\example.txt"))) { // reads serialized Java objects used for deserialization

            try{

                while (true) { // since an exception will occur when we reach to the end of the file and that exception will break the loop
                    Response res = (Response) ois.readObject ();
                    System.out.print (res.status + " ");
                    System.out.print (res.method + " ");
                    System.out.print (res.endpoint);

                    System.out.println ();
                }
            } catch (IOException e) {

                System.err.println (e);

            }


        } catch (IOException e) {
            System.err.println (e);
        } catch (ClassNotFoundException e) {
            System.err.println (e);
        }
    }
}
