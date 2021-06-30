import com.sun.net.httpserver.*;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class Main {
    public static void main(String[] args) {
        System.out.print(GetMessage());
        System.out.println("Starting REST Service...");
        ResourceConfig rc = new ResourceConfig().packages("at.clems2000");
        HttpServer server = JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:8080/"), rc);
        System.out.println("Server started!");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        server.stop(0);
        System.out.println("Server stopped");
    }

    public static String GetMessage() {
        return "Hello World";
    }




}
