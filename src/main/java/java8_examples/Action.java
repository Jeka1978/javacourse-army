package java8_examples;

/**
 * @author Evgeny Borisov
 */
public interface Action<T> {
    void doAction(T t);
}
