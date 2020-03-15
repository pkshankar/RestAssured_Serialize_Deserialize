package httpClient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import employoPojo.Employee;

public class PostCall {
	
	@Test
	public void postCall() throws ClientProtocolException, IOException {
		
		CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost("https://gorest.co.in/public-api/users");
		httpPost.addHeader("Content-Type", "application/json");
		httpPost.addHeader("Authorization", "Bearer 7_7bk8nRTMj2mI9UbmtNLVmunksMPAfWcBYv");
		Employee emp = new Employee("Jan2","Tin1","female","jan2@email.com","active");
		ObjectMapper mapper = new ObjectMapper();
		String requestPayload = mapper.writeValueAsString(emp);
		//System.out.println(requestPayload);
		httpPost.setEntity(new StringEntity(requestPayload));
		CloseableHttpResponse response = closeableHttpClient.execute(httpPost);
		System.out.println(response.getStatusLine().getStatusCode());
		System.out.println(EntityUtils.toString(response.getEntity()));
	}

}
