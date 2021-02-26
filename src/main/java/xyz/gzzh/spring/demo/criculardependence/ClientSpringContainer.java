package xyz.gzzh.spring.demo.criculardependence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientSpringContainer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //TODO Spring内部通过三级缓存来解决循环依赖问题 ，DefaultSingletonBeanRegistry
        A a = context.getBean("a", A.class);
        B b = context.getBean("b", B.class);
    }
}
