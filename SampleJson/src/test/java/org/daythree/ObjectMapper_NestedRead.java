package org.daythree;

import java.io.File;
import java.io.IOException;

import org.pojo.Address;
import org.pojo.EmployeeNested;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapper_NestedRead {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		ObjectMapper mapper = new ObjectMapper();

		File file = new File(
				"C:\\Greens\\API_Class_0630 Pm\\SampleJson\\src\\test\\resources\\json\\employeenested.json");

		EmployeeNested employeeNested = mapper.readValue(file, EmployeeNested.class);

		Address address = employeeNested.getAddress();

		String state = address.getState();

		System.out.println(state);

		String district = employeeNested.getAddress().getDistrict();

		System.out.println(district);
	}
}
