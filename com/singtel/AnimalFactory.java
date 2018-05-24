package com.singtel;

import com.singtel.BehaviorChange.BehaviorChange;
import com.singtel.Bird.Bird;
import com.singtel.Swim.Swim;

public abstract class AnimalFactory {
	
	protected int flyCount = 0;
	protected int walkCount = 0;
	protected int singCount = 0;
	protected int swimCount = 0;
	
	abstract protected Bird getBird(String animal);
	abstract protected Bird getBird(String animal,String neighbour);
	abstract protected Swim getSwimAnimal(String animal);
	abstract protected Swim getSwimAnimal(String animal,String animalType);
	abstract protected BehaviorChange getBehChangeAnimal(String Animal);
}
