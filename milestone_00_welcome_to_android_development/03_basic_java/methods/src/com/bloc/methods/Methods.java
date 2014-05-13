package com.bloc.methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

import com.bloc.test.Test;

public class Methods extends Object {

	public static void main(String [] args) {
		Methods methods = new Methods();
		Method method = null;
		if ((method = Test.testMethods(methods)) == null) {
			System.out.println("Excellent, all of your methods worked!\n");
		} else {
			System.out.println("Looks like your \'" + method.getName() + "\' method has an issue with it.\n");
		}
	}

	public boolean giveMeTheOpposite(boolean original) {
		/*
		 * ASSIGNMENT:
		 * Return the logical opposite of the passed parameter 'original'
		 */
		return !original;
	}

	public void flipTheSign(int[] numbers) {
		/*
		 * ASSIGNMENT:
		 * For all the integers in the array, reverse their sign:
		 * e.g. {1, 54, -12} becomes {-1, -54, 12}
		 */
		for (int i=0; i<(int)numbers.length; i++){
			numbers[i]=numbers[i]*(-1);
		}
	}

	public boolean[] boolsRule(int floor, int[] someNumbers) {
		/*
		 * ASSIGNMENT:
		 * This method returns an array of booleans of length someNumbers.length
		 * Each boolean represents whether that corresponding entry in the integer
		 * array is at least 'floor' e.g.
		 * {0, 5, 18, 2} with a floor of 6 returns {false, false, true, false}
		 */

		int[] myBoolean = new int[(int)someNumbers.length];

		for (int i=0; i<(int)someNumbers.length; i++){
			if(someNumbers[i]<floor)
				myBoolean[i] = 0;
			else
				myBoolean[i] = 1;		
		}
		return boolean[i]==0;
	}

	public int[] getMinAndMax(int[] someNumbers) {
		/*
		 * ASSIGNMENT:
		 * This method returns an array of length 2, the 0th index should contain
		 * the smallest number from withing someNumbers and the 1st index must
		 * be the largest e.g.
		 * {3, 6, 202, 2, 9986, 5} returns {2, 9986}
		 */
		for (int i=0; i<(int)someNumbers.length; i++){
			int min = someNumbers[i];
			int max = someNumbers[i]; 
			if (someNumbers[i+1]<someNumbers[i])
				min = someNumbers[i+1];
			if (someNumbers[i+1]>someNumbers[i])
				max = someNumbers[i+1];
		}

		return new int[2];
	}
}
