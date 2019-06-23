package real_spring;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class ServiceX {
    @Setter
    private ServiceY serviceY;

    public void doWork(){
        System.out.println("Working...");
        serviceY.doStuff();
    }
}
