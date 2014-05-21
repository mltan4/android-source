package com.bloc.generics;

import com.bloc.generics.things.*;

public class Main extends Object {

	public static void main(String [] args) {

		/*
		 * Put a bunch of Toys in the toybox!
		 */
		
		Toy<ActionFigure> actionfigure1 = new Toy<ActionFigure>(new ActionFigure());
		// Nick's awesome code-to-human guide for dummies
		// Toy data type with ActionFigure associated as the first generic type called af1
		// then assign a new instance of Toy with matching data type -- this requires a param that matches the first gen type 
		// The first gen type is ActionFigure. Then we create a new instance of ActionFigure which requires no param in its constructor 
		Toy<Book> book1 = new Toy<Book>(new Book());
		Toy<Spoon> spoon1 = new Toy<Spoon>(new Spoon());
		Toy<Thing> thing1 = new Toy<Thing>(new Thing("rubiks cube"));

		ToyBox toyBox = new ToyBox();
		
		toyBox.addToy(actionfigure1);
		toyBox.addToy(book1);		
		toyBox.addToy(spoon1);
		toyBox.addToy(thing1);
		
		if (toyBox.getToyCount() == 0) {
			System.out.println("Let's get some toys in that box!");
			System.exit(1);
		}

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
