package HomeWork_L1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PhotoCameraTestBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Camera) {
            System.out.println("Делаю пробное фото!");
            ((Camera) bean).doPhotograph();
            System.out.println("Отлично! Работает!");
        }
        return bean;
    }
}
