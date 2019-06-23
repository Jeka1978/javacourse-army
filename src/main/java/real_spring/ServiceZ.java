package real_spring;

import lombok.Setter;
import my_spring.InjectRandomInt;
import my_spring.InjectRandomName;

/**
 * @author Evgeny Borisov
 */
public class ServiceZ {
    @Setter
    private ServiceY serviceY;

    @InjectRandomName
    private String quote;

    public void doWork(){
        System.out.println(quote);
        serviceY.doStuff();
    }
}
