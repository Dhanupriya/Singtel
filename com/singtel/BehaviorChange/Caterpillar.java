package com.singtel.BehaviorChange;

public class Caterpillar implements BehaviorChange{

	@Override
	public void walk() {
		System.out.println("catterpillar can walk (crawl)");
		
	}

	@Override
	public void fly() {
		System.out.println("catterpillar can't fly");
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}

}
