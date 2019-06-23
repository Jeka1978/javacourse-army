package java8_examples;

/**
 * @author Evgeny Borisov
 */
public interface Rasar {
    default void talk(){
        System.out.println("COME TO ME!!!");
    }
}
