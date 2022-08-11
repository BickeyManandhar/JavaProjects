package com.sessions.springdemo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration // we need @Configuration annotation in the class that includes a method as a
				// bean
public class AppConfig {

	@Bean("listOfStudents")//this is how we overwrite bean name
	// creating a method named listBeans() that returns the added data in ArrayList
	// we want this to be treated as bean, which means instance of this will be
	// created and will be put in the container to do this we use annotation @Bean
	// annotation @Bean is always added on method level not on class level
	//by default the bean name will be the methods name but we can overwrite it too
	public List<String> listBeans() {
		List<String> listofBeans = new ArrayList<>();
		listofBeans.add("bean 1");
		listofBeans.add("bean 2");
		return listofBeans;
	}
}
