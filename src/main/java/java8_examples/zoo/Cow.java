package java8_examples.zoo;

/**
 * @author Evgeny Borisov
 */
public class Cow implements Animal {
    @Override
    public void makeVoice() {
        System.out.println("muuuuuuuuuu");
    }
}
