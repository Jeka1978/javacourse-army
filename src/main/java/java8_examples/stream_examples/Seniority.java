package java8_examples.stream_examples;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;

import static java.lang.Integer.MAX_VALUE;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public enum Seniority {
    JUNIOR(0, 10),
    MIDDLE(11, 20),
    SENIOR(21, MAX_VALUE);

    private final int minSalary;
    private final int maxSalary;

    public static Seniority findSeniority(int  salary) {
        return Arrays.stream(values())
                .filter(seniority -> seniority.minSalary <= salary)
                .filter(seniority -> seniority.maxSalary > salary)
                .findFirst()
                .get();
    }

}










