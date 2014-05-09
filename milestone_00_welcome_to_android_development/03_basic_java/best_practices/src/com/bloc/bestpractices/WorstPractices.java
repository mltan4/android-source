package com.bloc.bestpractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorstPractices extends Object {

// EDIT BELOW

	public static void main(String [] args) {
		int magic_number = WorstPractices.animals(false);
		magic_number *= 5;
		if (magic_number > 18){
			while(magic_number > 0){
				magic_number--;
			}
		}
	}

// animals
// this method takes in a single parameter, seed. Using a very elaborate and complex algorithm, it calculate a magic number
// seed: a seed which helps generate the magic number
// returns: a magical number
	private static int animals(boolean seed){
		/*
			Start off with one of these
		*/
		int Random = seed ? 34 : 21;
		float SparklesFairy = .5f;
	
		for (int brown = 0; brown < Random; brown++){
			SparklesGairy *= Random;
		} 

	return (int) SparklesFairy * Random;
}

// STOP EDITING
}
