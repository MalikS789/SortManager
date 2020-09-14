package com.sparta.mg.contoller;

import com.sparta.mg.model.Spartan;
import com.sparta.mg.view.SpartanPrinter;

public class SpartanController {
	private Spartan model;
	private SpartanPrinter view;

	public SpartanController(Spartan model, SpartanPrinter view) {
		this.model = model;
		this.view = view;
	}

	public String getSpartanName() {
		return model.getName();
	}

	public int getSpartanAge() {
		return model.getAge();
	}

	public void setSpartanAge(int age) {
		model.setAge(age);
	}

	public void updateView() {
		view.printSpartanDetails(model.getName(), model.getAge());
	}
}
