package com.singtel.Bird;

public class Chicken implements Bird {

	@Override
	public void walk() {
	}

	@Override
	public void fly() {
		System.out.println("A chicken cannot fly");
	}

	@Override
	public void swim() {
	}

	@Override
	public void sing() {
		System.out.println("A chicken says cluck cluck");
	}

}
