package com.heng.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.heng.beans.Person;

//Indicate the resource location(s) of the properties file to be loaded.
//可能@PropertySource就只支持properties文件
@PropertySource(value= {"classpath:person.properties"},encoding="utf-8")//<context:property-placeholder location="xxx" />
@Configuration
@ComponentScan(basePackages="com.heng")
public class MyConfig {

	
	//@Lazy
	@Bean(initMethod="beanInit",destroyMethod="beanDestroy")
	public Person person() {
		return new Person();
	}
	
	
}
