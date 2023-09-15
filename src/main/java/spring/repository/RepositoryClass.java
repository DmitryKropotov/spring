package spring.repository;

import org.springframework.stereotype.Repository;

@Repository
public class RepositoryClass {
    public String getMessageFromRepository() {
        return "hello, world, from service";
    }
}
