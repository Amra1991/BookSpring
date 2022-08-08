package com.java;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;






public class TestCalculator {

Calculator c=null;

CalculatorService service;
@Before
public void setUp() {
	c=new Calculator(service);
}
@Test
public void testAdd() {
	assertEquals(5,c.perform(2,3));
}


}
