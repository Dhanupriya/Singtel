package com.singtel.Swim;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Fish implements Swim {

	private String animalType;

	public Fish(String animal, String animalType) {
		this.animalType = animalType;
	}

	public Fish() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println("Fishes dont walk");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void swim() {
		System.out.println("Fishes can swim");
	}

	@Override
	public void sing() {
		System.out.println("Fishes dont sing");

	}

	@Override
	public void characterisctics() {
		Properties prop = new Properties();
		InputStream propFile = null;

		if (animalType != null) {
			try {

				propFile = new FileInputStream("src/com/singtel/Singtel.properties");
				prop.load(propFile);

				String characteristics = prop.getProperty(animalType.toLowerCase());
				System.out.println(animalType + " characteristics " + characteristics);

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (propFile != null) {
					try {
						propFile.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

}
