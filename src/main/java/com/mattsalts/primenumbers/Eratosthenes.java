package com.mattsalts.primenumbers;

import java.util.Arrays;

public class Eratosthenes implements Sieve {

	private static final int ARRAY_START = 0;

	public int[] getPrimeNumbers(int max) {
		if(max < 2) return new int[]{};
		boolean[] isComposite = new boolean[max+1];
		for(int count = 2; count*count <= max; count++)
		{
			if(!isComposite[count])
			{
				for(int n = count; count*n <= max; n++)
				{
					isComposite[count*n] = true;
				}
			}
		}
		int []primes = new int[max];
		int arrayCount = 0;
		for(int count = 2; count <= max; count++)
		{
			if(!isComposite[count])
			{
				primes[arrayCount] = count;
				arrayCount++;
			}
		}
		int[] neatPrimes = new int[arrayCount];
		neatPrimes = Arrays.copyOfRange(primes, ARRAY_START, arrayCount-1);
		return neatPrimes;
	}
}
