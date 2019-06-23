package chain_of_responsibility_spring;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class AgeValidator implements Validator {
    @Override
    public String validate(Person person) {
        if (person.getAge() <0) {
            return "age can't be negative";
        }
        return "";
    }
}
