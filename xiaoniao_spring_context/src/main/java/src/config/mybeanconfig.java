package src.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import outentity.outsource;
import src.condition.Linuxcondition;
import src.condition.Windowscondition;
import src.person;

@Configuration
@Conditional(Linuxcondition.class)
@ComponentScan(value = "src",includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {Service.class})

},useDefaultFilters = false)
@Import(outsource.class)//快熟导入单个组件，如果需要导入多个可以在里面传入一个数组
public class mybeanconfig {

    /*
     * 在这个scope中的参数总共有四种
     * singltone 单例 ioc容器中默认使用的单例，不管你以后什么时候用，都是同一个对象每次以后从容器中拿都是map.get()中去拿
     * prototype 多实例 ioc 容器启动的时候不会去拿出来使用，只有每一次去获取bean 的时候就会新创建一个代理对象
     * request 每次请求生成一个实例
     * session 同一个实例创建一个
     *
     * 懒加载
     *      专门针对于单实例
     *       默认单实例的bean就已经被创建好le  这个创建的一个
     *     第二次就懒加载一个实例 出来
     */
    @Bean
//    @Scope
    @Lazy
    public person getpeson(){
        return  new person();
    }

    /**
     *
     *  这里主要讲解按照条件@Condition这个注解，按照条件向容器中注入bean
     */
    @Conditional({Linuxcondition.class, Windowscondition.class})
    @Bean(name = "linux")
    public person getperson2(){
        return  new person();
    }
    @Bean(name = "windows")
    public person getperson3(){
        return  new person();
    }
    /**
     * 1)容器中注入组件componetscan
     * 2)@bean
     * 3)@import
     *   1.@import (传入类型的class 文件)
     *   2.@importSelector
     *   3 @importbeanDefinationRegestor这个接口
     * 4）是一个工厂bean FactoryBean
     */
}
