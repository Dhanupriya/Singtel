package com.singtel.Bird;

public class Duck implements Bird {

	@Override
	public void walk() {
	}

	@Override
	public void fly() {

	}

	@Override
	public void swim() {
		System.out.println("A duck can swim");
	}

	@Override
	public void sing() {
		System.out.println("A duck says :: quack quack");
	}

}
