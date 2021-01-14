package com.sparta.mg.O;

public class Pet {
	private String name;
	private String race;
	private int health;

	public Pet(String name, String race, int health) {
		this.name = name;
		this.race = race;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
}
