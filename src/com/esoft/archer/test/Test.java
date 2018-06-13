package com.esoft.archer.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esoft.archer.user.model.User;

@RestController
@SpringBootApplication
public class Test {
	
	@RequestMapping(value = "/helloworld")
	public User helloWorld() {
		return new User("mowang7410", "张凌捷", "15948786649");
	}

	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);

	}

}
