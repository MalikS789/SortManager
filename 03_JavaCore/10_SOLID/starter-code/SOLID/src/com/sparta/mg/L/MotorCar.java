package com.sparta.mg.L;

public class MotorCar implements Car {
	boolean isEngineOn;
	int currentSpeed;

	@Override
	public void turnOnEngine() {
		isEngineOn = true;
	}

	@Override
	public void accelerate() {
		currentSpeed += 100;
	}
}
