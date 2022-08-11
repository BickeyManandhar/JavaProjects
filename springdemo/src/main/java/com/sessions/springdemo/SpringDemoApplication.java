package com.sessions.springdemo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sessions.springdemo.service.CustomService;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		// ApplicationContext is the Spring Container
		ApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);
		String[] beanNames = applicationContext.getBeanDefinitionNames();

		/*
		 * if (beanNames == null) { System.out.println("Zero beans"); } else { for
		 * (String beanName : beanNames) { System.out.println("Bean Name: " + beanName);
		 * // we are printing the beans available in the container }
		 * System.out.println("Total Beans: " + beanNames.length);// we are printing out
		 * the number of beans in the // container }
		 */
		
		// this is how we Retrieve particular bean using applicationContext
		// we are not creating ArrayList here we are just getting bean from a container
		// and storing it in studentList
		ArrayList<String> studentList = (ArrayList<String>) applicationContext.getBean("listOfStudents");
		System.out.println(studentList);

		studentList.add("bean3"); // we are adding bean3 in studentList so studentList1 will print updated list

		ArrayList<String> studentList1 = (ArrayList<String>) applicationContext.getBean("listOfStudents");
		System.out.println(studentList1);
		
		//Retrieving beans using autowired
		CustomService cs=(CustomService) applicationContext.getBean("customService");// why small c?
		cs.test();
		
	}

}
