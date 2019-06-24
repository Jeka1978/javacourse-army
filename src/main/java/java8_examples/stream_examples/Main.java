package java8_examples.stream_examples;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = Stream.of("java", "scala", "kotlin","groovy")
                .collect(toMap(String::length,  t -> t,(s1, s2) -> s2+s1));

        System.out.println("map = " + map);

    }
}



