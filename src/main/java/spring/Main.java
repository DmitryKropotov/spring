package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.AppConfig;
import spring.service.ServiceClass;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, spring");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ServiceClass serviceClass = applicationContext.getBean("service", ServiceClass.class);
        System.out.println(serviceClass.getMessage());
    }
}
