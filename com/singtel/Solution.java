package com.singtel;

import com.singtel.BehaviorChange.BehaviorChange;
import com.singtel.Bird.Bird;
import com.singtel.Swim.Swim;


public class Solution {
	public static void main(String[] args) {

		AnimalFactory birdFactory = AnimalFactoryProducer.getAnimalFactory("bird");
		AnimalFactory swimFactory = AnimalFactoryProducer.getAnimalFactory("swim");
		AnimalFactory changeFactory = AnimalFactoryProducer.getAnimalFactory("change");

		if (birdFactory != null) {
			Bird[] birds = { birdFactory.getBird("Duck"), 
					birdFactory.getBird("Chicken"),
					birdFactory.getBird("Parrot", "cat"), 
					birdFactory.getBird("rooster"),
					birdFactory.getBird("rooster", "turkish") };

			for (Bird bird : birds) {
				if (bird != null) {
					bird.fly();
					bird.sing();
					bird.swim();
					bird.walk();
				}
			}
		}

		if (swimFactory != null) {
			Swim[] swim = { swimFactory.getSwimAnimal("fish", "shark") };
	
			for (Swim sw : swim) {
				if (sw != null) {
					sw.fly();
					sw.sing();
					sw.swim();
					sw.walk();
				}
			}
		}

		if(changeFactory != null) {
			BehaviorChange[] change = { changeFactory.getBehChangeAnimal("caterpillar"),
					changeFactory.getBehChangeAnimal("butterfly"),
					changeFactory.getBehChangeAnimal("cat")};
	
			for (BehaviorChange bc : change) {
				if( bc != null) {
					bc.fly();
					bc.sing();
					bc.swim();
					bc.walk();
				}
			}
		}

		int totalFlyCount = changeFactory.flyCount + birdFactory.flyCount + swimFactory.flyCount;
		int totalSwimCount = changeFactory.swimCount + birdFactory.swimCount + swimFactory.swimCount;
		int totalWalkCount = changeFactory.walkCount + birdFactory.walkCount + swimFactory.walkCount;
		int totalSingCount = changeFactory.singCount + birdFactory.singCount + swimFactory.singCount;

		System.out.println("Fly count :: " + totalFlyCount);
		System.out.println("SWim count :: " + totalSwimCount);
		System.out.println("Walk count :: " + totalWalkCount);
		System.out.println("Sing count :: " + totalSingCount);

	}
}
