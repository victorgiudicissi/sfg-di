package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set");
    } 

    @Override
    public void setBeanName(String s) {
        System.out.println("## Bean name is " + s);
    }

    @Override
    public void destroy() throws Exception {
                System.out.println("## End of the lifecycle");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
                System.out.println("## The LifeCycleBean has its properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
                System.out.println("## Application Context has been set");
    }
}
