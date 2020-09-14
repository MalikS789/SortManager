package com.sparta.mg.DefaultMethods;

public interface Computer {

	String getManufacturer();

	String upgrade();

	String getModel();

	default String switchOff() {
		return "Shutting down computer";
	}

	default String startup() {
		return "Turning on computer";
	}

	default int getRam() {
		return 16;
	}

	static String windowsWarning() {
		return "Running Windows 10!";
	}
}
