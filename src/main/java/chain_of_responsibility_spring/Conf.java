package chain_of_responsibility_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class Conf {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        MainValidator mainValidator = context.getBean(MainValidator.class);
        Person person = Person.builder().age(-20).build();
        mainValidator.printErrors(person);
    }
}
