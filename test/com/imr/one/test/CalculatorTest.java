package com.imr.one.test;

import static org.junit.Assert.*;

import org.junit.Test;

import come.imr.one.Calculator;

public class CalculatorTest {

	
@Test
public void testAdd(){
	Calculator calculator=new Calculator();
	double res=calculator.add(1.67d, 2.33d);
	assertEquals("Result and expected values are equal",3.9, res,0.1);
	
}

}
