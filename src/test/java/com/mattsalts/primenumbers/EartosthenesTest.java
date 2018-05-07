package com.mattsalts.primenumbers;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class EartosthenesTest {

	Eratosthenes sieve = new Eratosthenes();
	@Test
	public void testGetPrimeNumbersOne() {
		
		//Returns the empty set as neither 0 nor 1 are prime
		int[] primes = sieve.getPrimeNumbers(1);
		assertTrue(primes.length == 0);
	}

	@Test
	public void testGetPrimeNumbersTen() {
		int[] primes = sieve.getPrimeNumbers(10);
		assertTrue(primes.length == 4);
		assertTrue(primes[0] == 2);
		assertTrue(primes[1] ==3);
		assertTrue(primes[2] ==5);
		assertTrue(primes[3] ==7);
	}
	
	@Test
	public void testNegative()
	{
		int[] primes = sieve.getPrimeNumbers(-17);
		assertTrue(primes.length == 0);
	}
}
