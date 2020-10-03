package com.talento.testUnit;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

public class TestSuma extends TestCase{

	public void testSuma() {
		
		Suma suma = new Suma();
		double resultado= suma.sumar(1.0, 1.0);
		assertEquals(2.0, resultado);
	}
	
}
