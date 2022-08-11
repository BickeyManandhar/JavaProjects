package com.sessions.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomService {
	@Autowired //this is injecting the dependency where dependency is listOfStudents
	private List<String> listOfStudents;
	
	public void test() {
		System.out.println("This is from CustomService class: "+listOfStudents);
	}
}
