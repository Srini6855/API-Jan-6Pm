package org.automation;

import org.pojo.automation.FlightCreateRoot;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Feb23 extends BaseClass {

	@Test
	public void createFlight() {
		setup("https://www.omrbranch.com");
		addHeader("Content-Type", "application/json");
		String body = "{\r\n" + "    \"flightName\": \"Indigo\",\r\n" + "    \"Country\": \"China\",\r\n"
				+ "    \"Destinations\": 67,\r\n"
				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n" + "}";
		addBody(body);
		Response res = addRequest("post", "/api/flights");
		FlightCreateRoot as = res.as(FlightCreateRoot.class);
		Assert.assertEquals("Flight Created Successfully", as.getMessage(), "Verify the message in response body");
		Assert.assertEquals(201, getStatusCode(), "Verify the status code");

	}

}
