package chain_of_responsibility_spring;

/**
 * @author Evgeny Borisov
 */
public interface Validator {
    String validate(Person person);
}
