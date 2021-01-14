package com.sparta.mg;

public class Alphabet {
	public boolean checkForAlphabet(String word) {
		return word
				.toLowerCase()
				.chars()
				.filter(l -> l >= 'a' && l <= 'z')
				.distinct()
				.count() == 26;
	}
}
