package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.repository.RepositoryClass;

@Service("service")
public class ServiceClass {
    @Autowired
    private RepositoryClass repositoryClass;

    public String getMessage() {
        return repositoryClass.getMessageFromRepository();
    }
}
