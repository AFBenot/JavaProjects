package com.exercises;

/**
 * Exercise 3
 * @author Angel L. Fernandez
 */
public class Exercise3 {
	
	/**
	 * Pivot exercise
	 * @param numbers Numbers to test
	 */
	public static boolean pivotExcercise(int[] numbers){
		boolean result = false;
		
		int size = numbers.length;
		
		if(size >= 3){
			for (int i = 1; i<size-1 && !result; i++){
				int sum1 = 0;
				int sum2 = 0;
				for(int j = 0; j < i; j++){
					sum1 += numbers[j];
				}
				for(int j = i + 1; j < size; j++){
					sum2 += numbers[j];
				}
				if(sum1 == sum2) result = true;
			}
		}
		
		return result;
	}
	
}
