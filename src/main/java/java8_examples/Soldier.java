package java8_examples;

import lombok.AllArgsConstructor;
import lombok.Data;
import my_spring.InjectRandomName;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
public class Soldier {
    private int daysToFinishTheArmy;


    public static void main(String[] args) {
        List<Soldier> soldiers = asList(new Soldier(12), new Soldier(512), new Soldier(22));
        soldiers.stream().map(soldier -> soldier.getDaysToFinishTheArmy()).forEach(System.out::println);
    }











}
