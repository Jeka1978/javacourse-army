package real_spring;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Component
public class ServiceX {
    @Setter
    @Autowired
    private ServiceY serviceY;

    @PostConstruct
    public void doWork(){
        System.out.println("Working...");
        serviceY.doStuff();
    }
}
