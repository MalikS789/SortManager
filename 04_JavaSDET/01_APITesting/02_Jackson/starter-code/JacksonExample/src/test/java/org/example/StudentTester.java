package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTester {
	JacksonFileReader jacksonFileReader = new JacksonFileReader();
	StudentPOJO studentForTest = jacksonFileReader.readStudentAsJSON("src\\test\\resources\\newStudent.json");


	@Test
	void checkStudentJSONData() {
		assertEquals("Jimbob", studentForTest.getName());
	}

}
