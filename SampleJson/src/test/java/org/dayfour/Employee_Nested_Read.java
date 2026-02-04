package org.dayfour;

import java.io.File;
import java.io.IOException;

import org.pojo.Address;
import org.pojo.EmployeeNested;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee_Nested_Read {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		Address address = new Address();
		address.setDistrict("Coimbatore");

		EmployeeNested employeeNested = new EmployeeNested();

		employeeNested.setAddress(address);

		File file = new File(
				"C:\\Greens\\API_Class_0630 Pm\\SampleJson\\src\\test\\resources\\json\\employeenested.json");

		ObjectMapper mapper = new ObjectMapper();

		mapper.writeValue(file, employeeNested);
	}

}
