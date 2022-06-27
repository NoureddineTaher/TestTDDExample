package com.nouri.tdd.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAddition {
	
	
	@Test
	public void testAddtionNumerique() {
		Addition addition = new Addition();
		int s = addition.sum(12, 8);
		assertEquals(20, s);
	}
	
	@Test
	public void testAddtion() {
		Addition addition = new Addition();
		int s = addition.sum(0, 3);
		assertEquals(3, s);
	}
	
	

}
