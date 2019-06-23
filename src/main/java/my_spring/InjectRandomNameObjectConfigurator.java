package my_spring;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomNameObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {

            if (field.isAnnotationPresent(InjectRandomName.class)) {
                String heroName = new Faker().chuckNorris().fact();
                field.setAccessible(true);
                field.set(t,heroName);

            }


        }
    }
}
