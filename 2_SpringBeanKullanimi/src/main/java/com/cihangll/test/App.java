package com.cihangll.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cihangll.model.Person;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/cihangll/config/beans.xml");

		Person person = context.getBean("person", Person.class);
		System.out.println(person);

		Person person2 = context.getBean("person2", Person.class);
		System.out.println(person2);

		Person person3 = context.getBean("person3", Person.class);
		System.out.println(person3);
		((ClassPathXmlApplicationContext) context).close();
	}
}
