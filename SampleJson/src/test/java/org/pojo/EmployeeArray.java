package org.pojo;

import java.util.ArrayList;

public class EmployeeArray {

	private String name;
	private String email;
	private long phoneNo;
	private ArrayList<String> course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public ArrayList<String> getCourse() {
		return course;
	}

	public void setCourse(ArrayList<String> course) {
		this.course = course;
	}

}
