package org.sample;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Employee_Read {
	public static void main(String[] args) throws IOException, ParseException {
		// JSONPARSER is used to parse the JSON data
		// Java cannot understand JSON without parsing

		JSONParser jsonParser = new JSONParser();

		// I need to specify the file location
		// FileReader used to pass the file location

		FileReader fileReader = new FileReader(
				"C:\\Greens\\API_Class_0630 Pm\\SampleJson\\src\\test\\resources\\json\\employee.json");

		// Use parse() method which converts JSON file into generic java data
		Object object = jsonParser.parse(fileReader);

		// JSONObject -> we need to type casting object into JSONObject

		JSONObject employee = (JSONObject) object;

		// we have a method get() - retrive values

		Object nameObject = employee.get("name");

		// Convert object into string - type casting

		String name = (String) nameObject;

		System.out.println(name);
	}

}
