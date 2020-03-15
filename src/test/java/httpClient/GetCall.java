package httpClient;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import complexPojo_04.EmployeeDetails;


public class GetCall {

	@Test
	public void getCall() throws ClientProtocolException, IOException {

		CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("https://gorest.co.in/public-api/users");
		httpGet.addHeader("Authorization", "Bearer 7_7bk8nRTMj2mI9UbmtNLVmunksMPAfWcBYv");
		CloseableHttpResponse closeableHtppResponse = closeableHttpClient.execute(httpGet);
		// System.out.println(closeableHtppResponse.getStatusLine().getStatusCode());
		HttpEntity httpEntity = closeableHtppResponse.getEntity();
		String responsePayload = EntityUtils.toString(httpEntity);
		// EmployeeDetails employeeDetails = new EmployeeDetails();
		EmployeeDetails employeeDetails;
		ObjectMapper mapper = new ObjectMapper();
		employeeDetails = mapper.readValue(responsePayload, EmployeeDetails.class);
		System.out.println(employeeDetails.getResult()[0].getAddress());

	}

}
