package org.dayfour;

import java.io.File;
import java.io.IOException;

import org.pojo.Employee;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeWrite {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		Employee employee = new Employee();
		employee.setName("pranessh");
		employee.setEmail("sdf@gmail.com");

		ObjectMapper mapper = new ObjectMapper();

		File file = new File("C:\\Greens\\API_Class_0630 Pm\\SampleJson\\src\\test\\resources\\json\\employee.json");

		mapper.writeValue(file, employee);
	}

}
