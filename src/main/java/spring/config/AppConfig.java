package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.repository.RepositoryClass;
import spring.service.ServiceClass;

@Configuration
@ComponentScan("spring")
public class AppConfig {

//    @Bean
//    public RepositoryClass getRepository() {
//        return new RepositoryClass();
//    }
//
//    @Bean("service")
//    public ServiceClass getService() {
//        return new ServiceClass();
//    }
}
