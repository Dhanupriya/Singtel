package com.singtel.Bird;

import com.singtel.AnimalFactory;
import com.singtel.BehaviorChange.BehaviorChange;
import com.singtel.Swim.Swim;

public class BirdFactory extends AnimalFactory {

	@Override
	protected Bird getBird(String animal) {

		if (animal != null) {
			switch (animal.toUpperCase()) {
				case "DUCK":
					swimCount++;
					singCount++;
					return new Duck();
				case "CHICKEN":
					singCount++;
					return new Chicken();
				case "ROOSTER":
					singCount++;
					return new Rooster(); 						
				default:
					System.out.println("No such functionality implemented for :: " + animal);
					return null;
			}
		}
		return null;
	}

	@Override
	protected Bird getBird(String animal, String neighbourOrLang) {
		
		if (animal != null && neighbourOrLang != null) {
			switch (animal.toUpperCase()) {
			case "PARROT":
				singCount++;
				return new Parrot(neighbourOrLang);
			case "ROOSTER":
				singCount++;
				return new Rooster(neighbourOrLang); 	
			default:
				System.out.println("No such functionality implemented for :: " + animal);
				return null;
			}
		}
		return null;
	}

	@Override
	protected Swim getSwimAnimal(String animal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected BehaviorChange getBehChangeAnimal(String Animal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Swim getSwimAnimal(String animal, String animalType) {
		// TODO Auto-generated method stub
		return null;
	}
}
