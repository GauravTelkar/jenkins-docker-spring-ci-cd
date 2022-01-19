package com.ani.cicd.cicdjenkinsdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdJenkinsDemoApplicationTests {

	@Autowired
	private SmsController controller;

	//test case
	@Test
	void contextLoads() {
		Assertions.assertNotNull(controller);
	}

}
