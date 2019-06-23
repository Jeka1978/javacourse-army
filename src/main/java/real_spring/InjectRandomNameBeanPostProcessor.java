package real_spring;

import my_spring.InjectRandomIntObjectConfigurator;
import my_spring.InjectRandomNameObjectConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomNameBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        new InjectRandomNameObjectConfigurator().configure(bean);
        return bean;
    }
}
