package com.bloc.recursion;

import java.util.*;

public class RecursionUtils extends Object {
	/*
	 * findMaxRecursively
	 * Takes a list of numbers and finds the largest among them
	 * using recursive calls.
	 *
	 * @param numbers a list of numbers, can be odd or even numbered
	 * @return the largest number in the list
	 *
	 * Hint: your base case may be a comparison of 2 numbers
	 */
	public static final int findMaxRecursively(List<Integer> numbers) {
		
		for(int index = 0; numbers.size()>1; index++){
            if (numbers.get(index+1) > numbers.get(index))
            	numbers.remove(index);            	
            else
            	numbers.remove(index+1);            	

            findMaxRecursively(numbers);
        }
        return numbers.get(0);
	}	
}