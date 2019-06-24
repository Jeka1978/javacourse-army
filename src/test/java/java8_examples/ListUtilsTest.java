package java8_examples;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ListUtilsTest {

    List<String> strings = asList("java", "java", "Java", "Scala", "JAVA");

    @Test
    public void foreachWithDelay() {
        ListUtils.forEachWithDelay(strings,
                200,(Action<String>) System.out::println);
    }

    @Test
    public void countDuplicates() {
        int countDuplicates =
                ListUtils.countDuplicates("java", strings, (t1, t2) -> t1.equalsIgnoreCase(t2));
        System.out.println(countDuplicates);
    }
}







