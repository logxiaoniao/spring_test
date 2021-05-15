import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import src.config.mybeanconfig;

// 从这个例子可以看出 在spring后来的版本中定义了以Processor 中的一些东西在容器初始化的时候就已经有了一些
public class springIoctest {
    AnnotationConfigApplicationContext annotationConfigApplicationContext =
            new AnnotationConfigApplicationContext(mybeanconfig.class);
    @SuppressWarnings("resource")
    @Test
    public void  test01(){

        for (String a: annotationConfigApplicationContext.getBeanDefinitionNames()
             ) {
            System.out.println(a);
        }
    }
    @Test
    public void test02(){

    }
    @Test
    public void test03(){

    }
}
