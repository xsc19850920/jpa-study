package com.genpact.jpaproject.tests;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.genpact.jpaproject.entity.User;
import com.genpact.jpaproject.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-main.xml")
public class MysqlApplicationTests {
	@Autowired private UserService userService;
	@Test
	public void contextLoads() {
		User user = userService.findOne(1l);
		System.out.println(user.toString());
		
	}
	@Test
	public void createUser() {
		User user = new User("gaoyy","123","salt");
		userService.createUser(user);
	}
	@Test
	public void findByUsername() {
		User user = userService.findByUsername("gaoyy");
		System.out.println(user);
	}
	@Test
	public void update() {
		User user = userService.findByUsername("gaoyy");
		user.setSalt("update salt");
		
		user = userService.createUser(user);
		System.out.println(user);
	}
	
	
	
	
	
}
