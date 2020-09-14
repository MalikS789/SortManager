package com.sparta.org;

import org.json.simple.JSONObject;

public class App {
	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name","Manish");
		jsonObject.put("Age",108);
		jsonObject.put("Gender", "male");

		System.out.println(jsonObject);
	}
}
