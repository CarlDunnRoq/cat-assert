package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	
	@Test
	public void testRuns() {
		Cat cat = new Cat();
		cat.runs();
		assertEquals(cat.howHungry(), 80);
	}
	
	@Test
	public void testFeeds() {
		Cat cat = new Cat();
		cat.feeds();
		assertEquals(cat.howHungry(), 30);
	}
	
	@Test
	public void testFeedsAndRuns() {
		Cat cat = new Cat();
		cat.feeds();
		cat.runs();
		assertEquals(cat.howHungry(), 60);
	}
	
	@Test
	public void testRunsTooMuch() {
		Cat cat = new Cat();
		cat.runs();
		cat.runs();
		assertEquals(cat.isAlive(), false);
	}
	
	@Test
	public void testEatsALot() {
		Cat cat = new Cat();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		assertEquals(cat.howHungry(), 0);
	}
	
	@Test
	public void testTooMuchTrainingMakesCatADullBoy() {
		Cat cat = new Cat();
		cat.hunger = 0;
		int i = 0;
		while (i < 10) {
			cat.runs();
			cat.feeds();
			i++;
		}
		System.out.println(cat.hunger);
		assertEquals(cat.isAlive(), false);
	}
}