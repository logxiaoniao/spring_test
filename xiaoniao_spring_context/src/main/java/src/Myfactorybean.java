package src;

import org.springframework.beans.factory.FactoryBean;

import javax.swing.text.html.parser.Entity;

public class Myfactorybean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {

        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
