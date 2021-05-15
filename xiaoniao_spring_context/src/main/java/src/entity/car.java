package src.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class car {
    private String name;
    private String brand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public car() {
    }
    @PostConstruct// 该注解是在bean初始化赋值之后在调用该方法
    public void init(){
        System.out.println("初始化方法");
    }
    @PreDestroy
    public void destory(){
        System.out.println("销毁方法");
    }
}
