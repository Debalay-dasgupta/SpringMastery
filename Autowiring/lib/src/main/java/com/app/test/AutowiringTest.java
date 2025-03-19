package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Amazon;

public class AutowiringTest {
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Amazon a2 = context.getBean("amazon2", Amazon.class);
		a2.trackMyOrder(54789);
		Amazon amazon = context.getBean("amazon", Amazon.class);
		
		amazon.trackMyOrder(986542);
		
		
		
	}

}
