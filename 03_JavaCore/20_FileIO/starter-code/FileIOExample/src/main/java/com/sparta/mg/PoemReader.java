package com.sparta.mg;

import java.io.*;
import java.util.Arrays;

public class PoemReader {
	public void printPoem() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/text.txt"));
		String line;
		while ((line = bufferedReader.readLine()) !=null) {
			String[] sentence = line.split(", ");
			System.out.println(Arrays.toString(sentence));
		}
		bufferedReader.close();
	}

	public void writeToFile() throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/newFile.txt"));
		bufferedWriter.write("This is a sentence");
		bufferedWriter.close();
	}
}
