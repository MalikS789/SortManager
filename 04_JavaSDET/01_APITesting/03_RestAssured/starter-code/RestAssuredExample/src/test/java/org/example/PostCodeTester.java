package org.example;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostCodeTester {

	@Test
	public void whenRequestGet_thenOK() {
		given()
				.when().request("GET", "http://api.postcodes.io/postcodes/OX495NU")

				.then()
				.statusCode(200).assertThat().body("result.quality", equalTo(1));
	}
}
