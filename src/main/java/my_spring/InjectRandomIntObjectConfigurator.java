package my_spring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomIntObjectConfigurator implements ObjectConfigurator {
    private Random random = new Random();

    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Field[] declaredFields = type.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            InjectRandomInt annotation = declaredField.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                int value = random.nextInt(max - min) + min;
                declaredField.setAccessible(true);
                declaredField.set(t,value);
            }
        }
    }
}









