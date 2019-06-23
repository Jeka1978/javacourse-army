package real_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Evgeny Borisov
 */
public class Main {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Config.class);

    }
}
