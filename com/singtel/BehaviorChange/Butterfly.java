package com.singtel.BehaviorChange;

public class Butterfly extends Caterpillar {

	@Override
	public void fly() {
		System.out.println("Butterfly can fly");
	}

	@Override
	public void sing() {
		System.out.println("Butterfly doesnt make sound");
		
	}

}
