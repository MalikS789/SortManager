package com.sparta.mg;

public class Employees {
	//Serial Number,Company Name,Employee Markme,Description,Leave
	String serialNumber;
	String companyName;
	String markMe;
	String description;
	String leave;

	public Employees(String serialNumber, String companyName, String markMe, String description, String leave) {
		this.serialNumber = serialNumber;
		this.companyName = companyName;
		this.markMe = markMe;
		this.description = description;
		this.leave = leave;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getMarkMe() {
		return markMe;
	}

	public String getDescription() {
		return description;
	}

	public String getLeave() {
		return leave;
	}

	@Override
	public String toString() {
		return "Employees{" +
				"serialNumber='" + serialNumber + '\'' +
				", companyName='" + companyName + '\'' +
				", markMe='" + markMe + '\'' +
				", description='" + description + '\'' +
				", leave='" + leave + '\'' +
				'}';
	}
}
