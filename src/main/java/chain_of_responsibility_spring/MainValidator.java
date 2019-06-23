package chain_of_responsibility_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class MainValidator {


    @Autowired
    private List<Validator> validators;

    public void printErrors(Person person) {

        for (Validator validator : validators) {
            String message = validator.validate(person);
            if (!message.isEmpty()) {
                System.out.println(message);
            }
        }
    }

}












