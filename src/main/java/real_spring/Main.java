package real_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Evgeny Borisov
 */
public class Main {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("conf.xml").getBean(ServiceZ.class);

    }
}
