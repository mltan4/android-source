package com.bloc.securitypackages;

import com.bloc.securitypackages.apples.*;
import com.bloc.securitypackages.citrus.*;
//import com.bloc.securitypackages.citrus.Orange;

public class Main extends Object {
	
	public static void main(String [] args) {
		Fruit[] fruits = new Fruit[4];
		fruits[0] = new Macintosh();
		fruits[1] = new Green();
		fruits[2] = new Orange();
		fruits[3] = new Grapefruit();

		Color[] colors = new Color[5];
		colors[0] = fruits[0].getColor();
		colors[0] = fruits[1].getColor();
		colors[0] = fruits[2].getColor();
		colors[0] = fruits[3].getColor();
		colors[4] = new com.bloc.securitypackages.colors.Orange();
		
		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
