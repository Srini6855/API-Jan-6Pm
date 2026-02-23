package org.automation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	RequestSpecification req;
	Response response;

	// Setup
	public void setup(String baseURI) {
		RestAssured.baseURI = baseURI;
		req = RestAssured.given();
	}

	// add headers
	public void addHeader(String key, String value) {
		req = req.header(key, value);
	}

	// add body - Method overloading

	public void addBody(String body) {
		req = req.body(body);
	}

	public void addBody(Object body) {
		req = req.body(body);
	}

	// Common request method
	public Response addRequest(String method, String endPoint) {
		switch (method.toUpperCase()) {
		case "POST":
			response = req.post(endPoint);
			break;
		case "PUT":
			response = req.put(endPoint);
			break;
		case "PATCH":
			response = req.patch(endPoint);
			break;
		case "DELETE":
			response = req.delete(endPoint);
			break;
		case "GET":
			response = req.get(endPoint);
			break;

		default:
			break;
		}

		return response;
	}

	// get status code
	public int getStatusCode() {
		return response.getStatusCode();
	}

	// print response as pretty string
	public void printResponseBody() {
		System.out.println(response.asPrettyString());
	}
}
