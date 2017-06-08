package com.cihangll.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cihangll.model.Person;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/cihangll/config/beans.xml");

		Person person = context.getBean("person", Person.class);
		person.speak();

		((ClassPathXmlApplicationContext) context).close();
	}
}
