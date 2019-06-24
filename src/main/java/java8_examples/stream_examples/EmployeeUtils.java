package java8_examples.stream_examples;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtils {


    public Map<Seniority, List<Employee>> groupBySeniority(List<Employee> employees) {
        return employees.stream()
                .collect(groupingBy(employee -> Seniority.findSeniority(employee.getSalary())));
    }

    @SneakyThrows
    public static long calcWords(String fileName) {
        return Files
                .lines(Paths.get(fileName))
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .count();
    }


    public static int salary(List<Employee> employees) {
        return employees.stream()
                .peek(employee -> System.out.println(employee.getName()))
                .mapToInt(Employee::getSalary)
                .sum();
    }

    public static String names(List<Employee> employees) {
        return employees.stream()
                .map(Employee::getName)
                .reduce((s1, s2) -> s1 + ", " + s2).orElse("");
    }


}
