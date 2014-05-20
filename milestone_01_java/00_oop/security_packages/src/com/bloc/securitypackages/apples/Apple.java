package com.bloc.securitypackages.apples;

import com.bloc.securitypackages.Fruit;
import com.bloc.securitypackages.Color;

public abstract class Apple extends Fruit {

	public Apple(String simpleName, int calories, Color color, double size) {
		super(simpleName, calories, color, size);
	}

	public abstract void bite();

}	