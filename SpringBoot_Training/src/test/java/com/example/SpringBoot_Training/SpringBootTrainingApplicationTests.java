package com.example.SpringBoot_Training;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootTrainingApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testByPrint() {
		try {
			System.out.println("###################");
			System.out.println("test By print start");
			System.out.println("test By print end");
			System.out.println("###################");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
