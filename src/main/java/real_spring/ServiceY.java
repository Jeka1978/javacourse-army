package real_spring;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@ArmyService
public class ServiceY {

    public ServiceY() {
        System.out.println("Y was created");
    }

    public void doStuff() {
        System.out.println("Stufffffffffff");
    }
}
