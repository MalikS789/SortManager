package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonFileReader {
	ObjectMapper objectMapper = new ObjectMapper();

	public StudentPOJO readStudentAsJSON(String path) {
		StudentPOJO studentPOJO = new StudentPOJO();
		try {
			studentPOJO = objectMapper.readValue(new File(path), StudentPOJO.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return studentPOJO;
	}
}
