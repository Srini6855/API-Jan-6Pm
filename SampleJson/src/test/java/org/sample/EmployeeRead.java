package org.sample;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class EmployeeRead {
	public static void main(String[] args) throws IOException, ParseException {
		// 1. Create Object for JSONParser Class
		JSONParser jsonParser = new JSONParser();
		// 2. Pass the file location
		FileReader fileReader = new FileReader(
				"C:\\Greens\\API_Class_0630 Pm\\SampleJson\\src\\test\\resources\\Employee.json");
		Object object = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject) object;
		Object object2 = jsonObject.get("name");
		String name = (String) object2;
		System.out.println(name);

	}

}
