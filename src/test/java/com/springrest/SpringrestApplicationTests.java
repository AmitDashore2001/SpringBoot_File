package com.springrest;

import static org.assertj.core.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringrestApplicationTests {

	private Calculator c=new Calculator();
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void testSum() {
		int expectedResult =21;
		
		int actualResult=c.sum(12, 4, 5);
		
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	void productCount() {
		//ExpectedResult
		int expectedResult=12;
		
		//actualResult
		int b=c.product(4, 3);
		assertThat(b).isEqualTo(expectedResult);
		
	}
	
	
	
	
	
	

}
