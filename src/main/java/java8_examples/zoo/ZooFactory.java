package java8_examples.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class ZooFactory {
    private List<Supplier<Animal>> animalsBuilders = new ArrayList<>();
    {
        animalsBuilders.add(Dog::new);
        animalsBuilders.add(() -> new Cat());
    }

    public Animal createRandomAnimal() {
        Random random = new Random();
        int i = random.nextInt(animalsBuilders.size());
        Supplier<Animal> supplier = animalsBuilders.get(i);
        return supplier.get();
    }
}






