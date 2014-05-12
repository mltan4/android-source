package com.bloc.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bloc.test.Test;

public class Loops extends Object {

	public static void main(String [] args) {
		boolean[] someBools = {true, false, true, true, false, true, false, false};
		boolean temp = false;

		// Starts here
		int i = 7;
		int j = 0;

		while(i>=4){
			temp = someBools[i];
			someBools[i] = someBools[j];
			someBools[j] = temp;
			i--;
			j++;
		}

		if (Test.testBools(someBools)) {
			System.out.print("Your booleans are in proper order!\n");
		} else {
			System.out.print("Something in the while loop…\n");
			System.exit(0);
		}

		int[] numArray = new int[someBools.length];
		// This is known as an in-line conditional
		// learn more here: http://www.cafeaulait.org/course/week2/43.html

		// Starts here
		int x = 0;

		for(x=0; x<=7; x++){
			numArray[x] = !someBools[x] ? 1 : 0;

		}
		// Ends here

		/*
		 * ASSIGNMENT:
		 * Replace the operations above with a for loop
		 */

		if (Test.testInts(numArray)) {
			System.out.print("And you nailed the number array!\n");
		} else {
			System.out.print("Issue with the numbers…\n");
		}
	}
}
