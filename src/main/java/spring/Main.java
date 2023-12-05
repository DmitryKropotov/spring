package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.AppConfig;
import spring.service.ServiceClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello, spring");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ServiceClass serviceClass = applicationContext.getBean("service", ServiceClass.class);
        System.out.println(serviceClass.getMessage());

        callServer();
    }
    public static void callServer() throws IOException {
        URL url = new URL("http://localhost:8080/api/test");//new URL("https://www.google.com")-java.net.ConnectException: Connection refused: connect
        URLConnection myURL = url.openConnection();
        String inputLine;
        BufferedReader in = new BufferedReader(new InputStreamReader(myURL.getInputStream()));
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
    }
}
