package fileoperations.iopackage.filewriting.bytestreams;

import java.io.Serializable;

public class Response implements Serializable { // a marker interface that tells JVM that this class instance can be serialized to bytes
    public String endpoint;
    public int status;
    public String method;

    Response(String endpoint, int status, String method) {
        this.endpoint = endpoint;
        this.status = status;
        this.method = method;
    }

}
