package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practice {
	

	public static void main(String[] args) {

		List<Long> myList = calculatePrimeFactorsOf(27);
		for (long l : myList){
			System.out.println(l);
		}
		
	}

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public static List<Long> calculatePrimeFactorsOf(long l) {
		List<Long> factors = new ArrayList<>();

		for (long p = 2; p<=l; p++){
			if (l % p == 0){
				l = l/p;
				factors.add(p);
				p--;
			}
		}
		return factors;
	}
}
