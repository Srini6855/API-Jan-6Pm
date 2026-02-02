package org.sample;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Employee_Array_Read {
	public static void main(String[] args) throws IOException, ParseException {
		// JSONPARSER is used to parse the JSON data
		// Java cannot understand JSON without parsing

		JSONParser jsonParser = new JSONParser();

		// I need to specify the file location
		// FileReader used to pass the file location

		FileReader fileReader = new FileReader(
				"C:\\Greens\\API_Class_0630 Pm\\SampleJson\\src\\test\\resources\\json\\employeearray.json");

		// Use parse() method which converts JSON file into generic java data
		Object object = jsonParser.parse(fileReader);

		// JSONObject -> we need to type casting object into JSONObject

		JSONObject employeeNested = (JSONObject) object;

		Object courseObject = employeeNested.get("course");

		// Use JSONArray
		JSONArray courseArray = (JSONArray) courseObject;

		Object javaObject = courseArray.get(0);

		String java = (String) javaObject;

		System.out.println(java);
	}

}
