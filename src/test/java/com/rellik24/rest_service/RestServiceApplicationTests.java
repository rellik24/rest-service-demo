package com.rellik24.rest_service;

import com.rellik24.rest_service.model.Hello;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestServiceApplicationTests {
	@Autowired
	private Hello hello;

	@Test
	void contextLoads() {
		System.out.println(hello);
	}

}
