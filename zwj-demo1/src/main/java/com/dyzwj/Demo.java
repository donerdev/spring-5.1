package com.dyzwj;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext
				= new ClassPathXmlApplicationContext("classpath:spring.xml");
		System.out.println(applicationContext.getBeanFactory().getBeanDefinition("test1").getClass().getSimpleName());



	}
}
