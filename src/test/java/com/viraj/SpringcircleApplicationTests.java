package com.viraj;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringcircleApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void test1(){
		assertEquals(3, 1+2);
	}
	@Test
	public void test2(){
		assertEquals(4, 1+2);
	}

}
