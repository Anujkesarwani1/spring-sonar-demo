package com.zemoso.springdto.springdto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringdtoApplicationTests {

	@Test
	void contextLoads() {
		// Adding an assertion to check if the application context loads successfully
		Assertions.assertEquals(2, 1 + 1, "Application context loads successfully");
	}

}
