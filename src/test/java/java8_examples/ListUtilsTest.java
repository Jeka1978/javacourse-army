package java8_examples;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ListUtilsTest {

    @Test
    public void countDuplicates() {
        List<String> strings = asList("java", "java", "Java", "Scala", "JAVA");
        int countDuplicates =
                ListUtils.countDuplicates("java", strings, (t1, t2) -> t1.equalsIgnoreCase(t2));
        System.out.println(countDuplicates);
    }
}







