package com.singtel.Bird;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Rooster implements Bird {

	private String language = "default";

	public Rooster(String language) {
		this.language = language;
	}

	public Rooster() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {

	}

	@Override
	public void fly() {

	}

	@Override
	public void swim() {

	}

	@Override
	public void sing() {

		Properties prop = new Properties();
		InputStream propFile = null;
		try {

			propFile = new FileInputStream("src/com/singtel/Singtel.properties");
			prop.load(propFile);

			String sound = prop.getProperty(language.toLowerCase());
			System.out.println("A rooster in language " + language + " says :: " + sound);
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
