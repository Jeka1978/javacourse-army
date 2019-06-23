package java8_examples;

/**
 * @author Evgeny Borisov
 */
public class StringIgnoreCaseEqualator implements Equalator<String> {
    @Override
    public boolean myEquals(String t1, String t2) {
        return t1.equalsIgnoreCase(t2);
    }
}
