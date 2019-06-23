package never_use_switch;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;
import org.springframework.scheduling.annotation.SchedulingConfiguration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableScheduling
public class MyConf {
    @Bean
    public Faker faker(){
        return new Faker();
    }

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(MyConf.class);
    }





}
