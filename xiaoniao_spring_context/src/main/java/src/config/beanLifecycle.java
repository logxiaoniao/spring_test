package src.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import src.entity.car;

/**
 * 来处理容器的bean
 *    判断bean创建 初始化 销毁的方法
 * 1） 指定初始化和销毁方法 ： 以前的版本可以指定一个init ：method 或者destory：method
 * 2）
 */
@Configuration
@ComponentScan("src.entity")
public class beanLifecycle {
    @Bean

    public car getCreatecar() {
        return   new car();
    }
}
