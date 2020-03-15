package httpMethods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.http.Header;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetCall {
	
	
	@Test
	public void get() {
		
		Map<String, String> hMap = new HashMap<String, String>();
		hMap.put("Authorization", "Bearer 7_7bk8nRTMj2mI9UbmtNLVmunksMPAfWcBYv");
		RestAssured.baseURI="https://gorest.co.in";
		RequestSpecification request = RestAssured.given();
		request.headers(hMap);
		Response response = request.get("/public-api/users");
		//System.out.println(response.getBody().asString());
		response.prettyPrint();
		//System.out.println(response.getStatusCode());
		Headers headers = response.getHeaders();
		//List<Header> list = headers.asList();
		
	}

}
