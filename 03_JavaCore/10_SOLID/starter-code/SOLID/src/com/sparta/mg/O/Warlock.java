package com.sparta.mg.O;

public class Warlock {
	String name;
	int initialMana = 100;
	Pet pet;

	public Warlock(String name, Pet pet) {
		this.name = name;
		this.pet = pet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void launchHellFire() {
		initialMana = initialMana - 10;
	}
}
