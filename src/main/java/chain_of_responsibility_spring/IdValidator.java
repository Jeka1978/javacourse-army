package chain_of_responsibility_spring;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */

@Component
public class IdValidator implements Validator {
    @Override
    public String validate(Person person) {
        if (person.getId() == 0) {
            return "id can't be 0";
        }else {
            return "";
        }
    }
}
