package java8_examples.stream_examples;

import lombok.Builder;
import lombok.Data;

import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
public class Employee {
    private String name;
    private int salary;
}
