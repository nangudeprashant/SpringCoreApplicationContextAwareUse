package com.javaLive.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaLive.beans.PrototypeBean;
import com.javaLive.beans.SingletonBean;

public class MainClass {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		SingletonBean singleton = (SingletonBean) context.getBean("singletonBean");
		PrototypeBean prototypeBeanA = singleton.getPrototypeBean();
		PrototypeBean prototypeBeanB = singleton.getPrototypeBean();
		System.out.println(prototypeBeanA);
		System.out.println(prototypeBeanB);
		System.out.println("Is prototypeBeanA and prototypeBeanA  same ? " + (prototypeBeanA == prototypeBeanB));
		context.registerShutdownHook();
	}
}