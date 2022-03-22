package lab.oodp.oop.test;

import static org.junit.Assert.assertTrue;

import org.junit.*;
import org.junit.Assert;

import lab.oodp.exception.ArraysAndExceptions;
import lab.oodp.exception.IndexTooHighException;
import lab.oodp.exception.IndexTooLowException;
import lab.oodp.exception.InvalidIndexException;

public class TestArraysAndExceptions {
	
	public ArraysAndExceptions ae = null;

	@Before
	public void setUp() {
		ae = new ArraysAndExceptions();
		ae.generateArray();
	}

	@Test
	public void testTooHigh() {
		try {
			ae.getArrayIndex("10");
		} catch (InvalidIndexException e) {
			assertTrue(false);
		} catch (IndexTooHighException e) {
			assertTrue(true);
		} catch (IndexTooLowException e) {
			assertTrue(false);
		}

	}
	
	@Test
	public void testTooLow() {
		try {
			ae.getArrayIndex("-10");
		} catch (InvalidIndexException e) {
			assertTrue(false);
		} catch (IndexTooHighException e) {
			assertTrue(false);
		} catch (IndexTooLowException e) {
			assertTrue(true);
		}

	}
	
	@Test
	public void testInvalid() {
		try {
			ae.getArrayIndex("xx");
		} catch (InvalidIndexException e) {
			assertTrue(true);
		} catch (IndexTooHighException e) {
			assertTrue(false);
		} catch (IndexTooLowException e) {
			assertTrue(false);
		}

	}

}
