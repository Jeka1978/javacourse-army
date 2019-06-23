package java8_examples;

/**
 * @author Evgeny Borisov
 */
public interface Officer {
    default void talk(){
        System.out.println("Come to me");
    }
}
