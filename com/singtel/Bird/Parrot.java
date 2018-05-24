package com.singtel.Bird;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Parrot implements Bird {

	private String neighbour;

	public Parrot(String neighbour) {
		this.neighbour = neighbour;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sing() {

		Properties prop = new Properties();
		InputStream propFile = null;
		try {

			propFile = new FileInputStream("src/com/singtel/Singtel.properties");
			prop.load(propFile);
			
			String sound = prop.getProperty(neighbour.toLowerCase());
			System.out.println("A parrot living near " + neighbour + " says " + sound);
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
