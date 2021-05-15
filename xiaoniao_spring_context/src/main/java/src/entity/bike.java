package src.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;

public class bike implements InitializingBean , DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
     //定义一个bean的额初始化初始化//这里是数据的属性什么的都设置好了之后就执行该方法

    }

    @Override
    public void destroy() throws Exception {
// 销毁方法
    }
}
