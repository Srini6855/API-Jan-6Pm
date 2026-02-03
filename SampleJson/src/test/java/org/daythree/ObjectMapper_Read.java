package org.daythree;

import java.io.File;
import java.io.IOException;

import org.pojo.Employee;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapper_Read {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		// ObjectMapper class to convert JSON to java object
		ObjectMapper mapper = new ObjectMapper();

		File file = new File("C:\\Greens\\API_Class_0630 Pm\\SampleJson\\src\\test\\resources\\json\\employee.json");

		Employee employee = mapper.readValue(file, Employee.class);

		String name = employee.getName();

		System.out.println(name);
	}

}
