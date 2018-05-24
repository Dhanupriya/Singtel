package com.singtel;

import com.singtel.BehaviorChange.BehaviorChangeFactory;
import com.singtel.Bird.BirdFactory;
import com.singtel.Swim.SwimFactory;

public class AnimalFactoryProducer {

	public static AnimalFactory getAnimalFactory(String animal) {

		if (animal != null) {
			switch (animal.toUpperCase()) {
				case "BIRD":
					return new BirdFactory();
				case "SWIM":
					return new SwimFactory();
				case "CHANGE":
					return new BehaviorChangeFactory();
				default:
					System.out.println("No such functionality implemented for :: " + animal);
					break;
			}
		}

		return null;
	}
}
