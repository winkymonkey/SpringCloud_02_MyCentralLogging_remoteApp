package com.example.spring.boot;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/remoteApp")
public class MyRestController {
	
	private static final Logger LOGGER = LogManager.getLogger(MyRestController.class);
	
	
	/**
	 * ----------------------------------------------------
	 * URL: http://localhost:8091/remoteApp/person
	 * ----------------------------------------------------
	 */
	@GetMapping("/person")
	public List<Person> person() {
		LOGGER.info("entering endpoint0");
		Person person1 = new Person();
		person1.setId(101L);
		person1.setAge(31);
		person1.setFirstName("FNAME-1");
		person1.setLastName("LNAME-1");
		
		Person person2 = new Person();
		person2.setId(102L);
		person2.setAge(32);
		person2.setFirstName("FNAME-2");
		person2.setLastName("LNAME-2");
		
		List<Person> personList = new ArrayList<>();
		personList.add(person1);
		personList.add(person2);
		
		return personList;
	}
	
}
