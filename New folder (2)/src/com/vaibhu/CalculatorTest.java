package com.vaibhu;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {

		Calculator test = new Calculator();
		//test.calculate();
		
		int result=(int) test.addition(2,2);
		assertEquals(5,result,0);
		
	}
	

}
