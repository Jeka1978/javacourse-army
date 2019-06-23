package chain_of_responsibility_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Component
public class StamService {
    @Autowired
    private Validator idValidator;

    @Value("${last_name}")
    private String name;

    @PostConstruct
    public void init(){
        System.out.println("name = " + name);
    }












}
