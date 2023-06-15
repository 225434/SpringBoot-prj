package com.yCloud.config;

import com.yCloud.vo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration注解表示当前类是作为配置文件使用的，用来配置文件。
 * 相当于beans.xml
 */
@Configuration
public class SpringConfig {
    /**
     * 创建方法，方法的返回值是对象，并在方法的上面加上@Bean
     * 方法的返回值对象就注入到容器中。
     */
    @Bean
    public Student createStudent(){
        Student student = new Student();
        student.setName("金角");
        student.setAge(234);
        student.setSex("男");
        return student;
    }
}
