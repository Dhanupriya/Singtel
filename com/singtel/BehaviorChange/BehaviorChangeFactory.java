package com.singtel.BehaviorChange;

import com.singtel.AnimalFactory;
import com.singtel.BehaviorChange.BehaviorChange;
import com.singtel.Bird.Bird;
import com.singtel.Bird.Chicken;
import com.singtel.Bird.Duck;
import com.singtel.Bird.Rooster;
import com.singtel.Swim.Swim;

public class BehaviorChangeFactory extends AnimalFactory {

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Swim getSwimAnimal(String animal, String animalType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected BehaviorChange getBehChangeAnimal(String animal) {
		// TODO Auto-generated method stub
		if (animal != null) {
			switch (animal.toUpperCase()) {
				case "CATERPILLAR":
					walkCount++;
					return new Caterpillar();
				case "BUTTERFLY":
					flyCount++;
					return new Butterfly();
				default:
					System.out.println("No such functionality implemented for :: " + animal);
					return null;
			}
		}
		return null;
	}

}
