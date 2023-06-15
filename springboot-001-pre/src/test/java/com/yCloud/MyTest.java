package com.yCloud;

import com.yCloud.config.SpringConfig;
import com.yCloud.vo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    //使用XML
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println("容器中的对象：" + student);
    }

    //使用JavaConfig
    @Test
    public void test02() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = applicationContext.getBean("createStudent", Student.class);
        System.out.println("使用javaConfig:" + student);
    }
}
