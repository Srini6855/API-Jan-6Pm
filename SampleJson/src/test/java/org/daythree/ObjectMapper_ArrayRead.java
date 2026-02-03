package org.daythree;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.pojo.EmployeeArray;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapper_ArrayRead {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		ObjectMapper mapper = new ObjectMapper();

		File file = new File(
				"C:\\Greens\\API_Class_0630 Pm\\SampleJson\\src\\test\\resources\\json\\employeearray.json");

		EmployeeArray employeeArray = mapper.readValue(file, EmployeeArray.class);

		ArrayList<String> course = employeeArray.getCourse();

		String string = course.get(0);

		System.out.println(string);

		for (String string1 : course) {
			System.out.println(string1);
		}
	}

}
