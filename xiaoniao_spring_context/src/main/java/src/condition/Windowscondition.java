package src.condition;

import com.sun.org.apache.bcel.internal.util.ClassLoader;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class Windowscondition  implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 获取环境，这个环境是一个环境变量等等
        Environment environment = conditionContext.getEnvironment();
        String osname = environment.getProperty("os.name");
        // 获取类的加载器
        ClassLoader classLoader = (ClassLoader) conditionContext.getClassLoader();
        // 获取类的bean工厂
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        //注册一个bean 的定义
        BeanDefinitionRegistry registry = conditionContext.getRegistry();
        registry.containsBeanDefinition("person");// 是否含有某一个bean 在容器里

        //
        if(osname.contains("windows")){
            return  true;
        }
        return false;
    }
}
