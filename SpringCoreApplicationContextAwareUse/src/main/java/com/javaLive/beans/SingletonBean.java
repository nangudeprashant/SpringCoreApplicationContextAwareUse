package com.javaLive.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SingletonBean implements ApplicationContextAware {
	private PrototypeBean prototypeBean;
	private ApplicationContext applicationContext;

	public SingletonBean() {
		System.out.println("Singleton Bean Instantiated !!");
	}

	public PrototypeBean getPrototypeBean() {
		prototypeBean = (PrototypeBean) applicationContext.getBean("prototypeBean");
		return prototypeBean;
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
