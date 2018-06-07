package com.bad.code;

import java.util.LinkedList;
import java.util.List;

/** 
 * This class generate prime number
 *
 */

public class badCode1 {
	
	private int maxLimit;	
	

	public badCode1(int i){
		
	}

public static List<Integer> primeNumbersBruteForce(int n) {
	List<Integer> primeNumbers = new LinkedList<>();
	if (n >= 2) 
	{
			primeNumbers.add(2);
		}
		for (int i = 3; i <= n; i += 2) {
			if (isPrimeBruteForce(i)) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

	private static boolean isPrimeBruteForce(int number) {
		for (int i = 2; i * i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		List<Integer> primeNu = primeNumbersBruteForce(100);
		primeNu.forEach(i -> System.out.println(i));
	}
	
	public int getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}

}
