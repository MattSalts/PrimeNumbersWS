package com.mattsalts.primenumbers;

import java.util.HashMap;
import java.util.Map;

public class PrimeNumberService {

	Map<Integer, Sieve> availableSieves = new HashMap<Integer, Sieve>();
	public int[] getPrimeNumbers(int limit, int identifier)
	{
		Sieve s = getSieve(identifier);
		return s.getPrimeNumbers(limit);
	}
	
	public PrimeNumberService()
	{
		Sieve eratosthenes = new Eratosthenes();
		availableSieves.put(1, eratosthenes);
	}
	
	private Sieve getSieve(final int index)
	{
		return availableSieves.get(index);
	}
}
