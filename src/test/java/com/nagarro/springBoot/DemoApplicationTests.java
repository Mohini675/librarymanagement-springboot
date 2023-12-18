package com.nagarro.springBoot;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
public static final Logger Logger  = LoggerFactory.getLogger(DemoApplicationTests.class);
	@Test
	void contextLoads() {
		Logger.info("Running a Test cases");
	}

}
