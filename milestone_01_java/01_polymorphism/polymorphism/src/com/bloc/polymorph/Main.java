package com.bloc.polymorph;

import com.bloc.polymorph.pets.*;

public class Main extends Object {

	public static void main(String [] args) {

		Dog dog = new Dog(); 
		Cat cat = new Cat();
		Bird bird = new Bird();
		Snake snake = new Snake();
		Tarantula tarantula = new Tarantula();
		
		Pet[] pet = new Pet[] {dog, cat, bird, snake, tarantula};

		// dog is ref variable, Dog is data type, new Dog() is object of type Dog
		// superclass Pet can be assigned to dog
		
		// Accomplish the below using polymorphism

		for(int x=0; x<5; x++){
			pet[x].feed();
			pet[x].wash();
			pet[x].exercise();
		}
//		dog.feed();
//		dog.wash();
//		dog.exercise();
//
//		cat.feed();
//		cat.wash();
//		cat.exercise();
//
//		bird.feed();
//		bird.wash();
//		bird.exercise();
//
//		snake.feed();
//		snake.wash();
//		snake.exercise();
//
//		tarantula.feed();
//		tarantula.wash();
//		tarantula.exercise();

		// Accomplish the above using polymorphism

		if (!(dog.isFed() && dog.isWashed() && dog.isExercised())) {
			System.out.println("Your dog needs a little more attention");
			System.exit(1);
		}

		if (!(cat.isFed() && cat.isWashed() && cat.isExercised())) {
			System.out.println("Your cat needs a little more attention");
			System.exit(1);
		}

		if (!(bird.isFed() && bird.isWashed() && bird.isExercised())) {
			System.out.println("Your bird needs a little more attention");
			System.exit(1);
		}

		if (!(snake.isFed() && snake.isWashed() && snake.isExercised())) {
			System.out.println("Your snake needs a little more attention");
			System.exit(1);
		}

		if (!(tarantula.isFed() && tarantula.isWashed() && tarantula.isExercised())) {
			System.out.println("Your tarantula needs a little more attention");
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
