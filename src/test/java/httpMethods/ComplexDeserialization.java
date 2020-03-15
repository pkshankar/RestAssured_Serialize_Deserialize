package httpMethods;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import complexPojo_04.Avatar;
import complexPojo_04.Edit;
import complexPojo_04.EmployeeDetails;
import complexPojo_04.RateLimit;
import complexPojo_04.Result;
import complexPojo_04.Self;
import complexPojo_04._Links;
import complexPojo_04._Meta;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ComplexDeserialization {

	@Test
	public void jsonToPojoEmployee() throws JsonMappingException, JsonProcessingException {

		Map<String, String> map = new HashMap<String, String>();
		map.put("Authorization", "Bearer 7_7bk8nRTMj2mI9UbmtNLVmunksMPAfWcBYv");
		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request = RestAssured.given();
		request.headers(map);
		Response response = request.get("/public-api/users");
		JsonPath jPath = response.jsonPath();
		int resultSize = jPath.getList("result").size();
		String responsePayload = response.getBody().asString();
		Avatar avatar = new Avatar();
		Edit edit = new Edit();
		Self self = new Self();
		_Links _links = new _Links();
		Result[] result = new Result[resultSize];
		RateLimit rateLimit = new RateLimit();
		_Meta _meta = new _Meta();
		EmployeeDetails employeeDetails = new EmployeeDetails();
		ObjectMapper mapper = new ObjectMapper();
		employeeDetails = mapper.readValue(responsePayload, EmployeeDetails.class);
		//System.out.println(employeeDetails.get_meta().getPerPage());
		//System.out.println(employeeDetails.get_meta().getRateLimit().getRemaining());
		for(int i=0; i<resultSize;i++) {
		System.out.println(employeeDetails.getResult()[i].getFirst_name());
		}
	}
}
