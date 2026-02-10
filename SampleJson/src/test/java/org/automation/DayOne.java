package org.automation;

import org.pojo.automation.FlightCreateRoot;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DayOne {
	public static void main(String[] args) {

		RequestSpecification req;
		// Post request - Flight Creation
		// Input
		// 1. endpoints
		// 2. headers
		// 3. body
		// 4. Type of request

		// Output
		// Status Code
		// Any message in response body

		// Initial api
		req = RestAssured.given().header("Content-Type", "application/json");

		// Pasing body
		req = req.body("{\r\n" + "    \"flightName\": \"Indigo\",\r\n" + "    \"Country\": \"China\",\r\n"
				+ "    \"Destinations\": 67,\r\n"
				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n" + "}");

		// Passing the endpoint
		Response response = req.post("https://www.omrbranch.com/api/flights");

		// Status code
		int statusCode = response.getStatusCode();

		System.out.println("Status code : " + statusCode);

		// Response body
		String asString = response.asString();

		// Response body in readable format

		String asPrettyString = response.asPrettyString();

		System.out.println(asString);

		System.out.println(asPrettyString);

		// To read values from response body

		FlightCreateRoot as = response.as(FlightCreateRoot.class);

		String message = as.getMessage();

		System.out.println(message);

		int id = as.getData().getId();

		System.out.println(id);

	}

}
