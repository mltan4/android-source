package com.bloc.interfaces;

import com.bloc.interfaces.people.*;
//Clarify: doesn't calling the methods retained inside John, Mary, Albert make the hobbies interface useless?

public class Main extends Object {

	public static void main(String [] args) {
		John john = new John();
		Mary mary = new Mary();
		Albert albert = new Albert();

		john.getInCar();
		john.startEngine();
		john.driveFast();

		mary.getInPlane();
		mary.jumpFromPlane();
		mary.releaseParachute();

		albert.putOnShoes();
		albert.findAPartner();
		albert.salsa();

		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/* Nice work, you pass! */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
