package httpMethods;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import detailsPojo.Person;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostCall {
	
	@Test
	public void createPersonDetail() {
		
		String payload = null ;
		Map<String,String> map = new HashMap<String,String>();
		map.put("Authorization", "Bearer 7_7bk8nRTMj2mI9UbmtNLVmunksMPAfWcBYv");
		map.put("Content-Type", "application/json");
		RestAssured.baseURI="https://gorest.co.in";
		RequestSpecification request = RestAssured.given();
		request.headers(map);
		Person person = new Person("Som","Ved","male","som9@roberts.com","active");
		ObjectMapper mapper = new ObjectMapper();
		try {
			payload = mapper.writeValueAsString(person);
			
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
		
		request.body(payload);
		Response response = request.post("/public-api/users");
		response.prettyPrint();
				
	}

}
