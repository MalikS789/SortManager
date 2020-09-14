package com.sparta.mg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {
	public static void getValues() throws IOException {
		long start = System.nanoTime();
		ArrayList<Employees> employeeCollection = new ArrayList<>();
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/employees.csv"));
		String line;
		while((line = bufferedReader.readLine()) !=null ) {
			String[] records = line.split(",");
			Employees employees = new Employees(records[0], records[1], records[2], records[3], records[4]);
			employeeCollection.add(employees);
		}
		for (Employees employees:employeeCollection) {
			System.out.println(employees.toString());
		}
		long end = System.nanoTime();
		System.out.println("Time = " + (end - start)/1000000);
	}
}
