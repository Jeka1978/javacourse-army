package real_spring;

import lombok.Setter;
import my_spring.InjectRandomInt;
import my_spring.InjectRandomName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class ServiceZ {
    @Setter
    @Autowired
    private ServiceY serviceY;

    @InjectRandomName
    private String quote;

    public void doWork(){
        System.out.println(quote);
        serviceY.doStuff();
    }
}
