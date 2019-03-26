package com.dbs.training.maventrain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculator {
	

	@Test
	public void testAdd()
	{
		Calculator c= new Calculator();
		assertEquals(10,c.add(5, 5));
		
		
	}
	@Test
	public void testSub()
	{
		Calculator c= new Calculator();
		assertEquals(5,c.sub(15, 10));
		
		
	}

}
