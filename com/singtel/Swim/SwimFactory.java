package com.singtel.Swim;

import com.singtel.AnimalFactory;
import com.singtel.BehaviorChange.BehaviorChange;
import com.singtel.Bird.Bird;
import com.singtel.Bird.Chicken;
import com.singtel.Bird.Duck;
import com.singtel.Bird.Rooster;

public class SwimFactory extends AnimalFactory {

	@Override
	protected Bird getBird(String animal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Bird getBird(String animal, String neighbour) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Swim getSwimAnimal(String animal) {
		if (animal != null) {
			switch (animal.toUpperCase()) {
			case "FISH":
				swimCount++;
				return new Fish();
			case "DOLPHIN":
				swimCount++;
				return new Dolphin();
			default:
				System.out.println("No such functionality implemented for :: " + animal);
				return null;
			}
		}
		return null;
	}

	@Override
	protected Swim getSwimAnimal(String animal, String animalType) {
		if (animal != null && animalType != null) {
			switch (animal.toUpperCase()) {
			case "FISH":
				return new Fish(animal,animalType);
			default:
				System.out.println("No such functionality implemented for :: " + animal + " and " + animalType);
				return null;
			}
		}
		return null;
	}

	@Override
	protected BehaviorChange getBehChangeAnimal(String Animal) {
		// TODO Auto-generated method stub
		return null;
	}

}
