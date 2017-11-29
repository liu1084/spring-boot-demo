package com.jim.springboot.config;

import com.jim.springboot.model.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: liu jun
 * @date: 23:59 2017/11/29
 * @ver: 1.0
 * @desc:
 */
@Configuration
@PropertySource(value = "classpath:student.properties")
public class StudentConfiguration {

	@Value("${name}")
	private String name;

	@Value("${className}")
	private String className;

	@Bean(name = "student1")
	public Student getStudent(){
		Student student = new Student();
		student.setName(this.name);
		student.setClassName(this.className);
		return student;
	}
}
