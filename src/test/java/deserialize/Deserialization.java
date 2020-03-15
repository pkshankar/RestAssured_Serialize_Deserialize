package deserialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Pojo.Address;
import Pojo.Employee;
import complexPojo_01.EmployeeDetails;
import complexPojo_02.Client;
import complexPojo_02.ClientDetails;
import complexPojo_02.Currency;

public class Deserialization {

	@Test
	public void jsonToPojoEmployee() throws JsonParseException, JsonMappingException, IOException {

		String jsonFilePath = "C:\\Users\\pkshank\\eclipse-workspace\\RestAssured_Serialization_01\\src\\test\\java\\jsonFiles\\Employee.json";
		FileInputStream fis = null;
		Address address = new Address();
		Employee employee = new Employee();
		try {
			fis = new FileInputStream(jsonFilePath);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		ObjectMapper mapper = new ObjectMapper();
		employee = mapper.readValue(fis, Employee.class);
		System.out.println("ID : " + employee.getId());
		System.out.println("NAME : " + employee.getName());
		System.out.println("PERMANENT : " + employee.isPermanent());
		System.out.println("STREET : " + employee.getAddress().getCity());
		System.out.println("CITY : " + employee.getAddress().getCity());
		System.out.println("ZIPCODE : " + employee.getAddress().getZipcode());
		System.out.println("PHONE NUMBER 1 : " + employee.getPhoneNumbers()[0]);
		System.out.println("PHONE NUMBER 2 : " + employee.getPhoneNumbers()[1]);
		System.out.println("ROLE : " + employee.getRole());

	}

	@Test(enabled=false)
	public void jsonToPojoEmployeeDetails() throws JsonParseException, JsonMappingException, IOException {

		String jsonFilePath = "C:\\Users\\pkshank\\eclipse-workspace\\RestAssured_Serialize_Deserialize\\src\\test\\java\\jsonFiles\\EmployeeDetails.json";
		FileInputStream fis = new FileInputStream(jsonFilePath);
		EmployeeDetails[] employeeDetails = new EmployeeDetails[2];
		for (int i = 0; i < employeeDetails.length; i++) {

			employeeDetails[i] = new EmployeeDetails();
		}
		ObjectMapper mapper = new ObjectMapper();
		employeeDetails = mapper.readValue(fis, EmployeeDetails[].class);
		for (EmployeeDetails emp : employeeDetails) {

			System.out.println(emp.getEmpLocation());
		}

	}

	@Test
	public void jsonToPojoClient() throws JsonParseException, JsonMappingException, IOException {
		
		String jsonFilePath = "C:\\Users\\pkshank\\eclipse-workspace\\RestAssured_Serialize_Deserialize\\src\\test\\java\\jsonFiles\\Client.json";
		FileInputStream fis;
		Currency[] currency;
		Client[] client;
		ClientDetails[] clientDetails;
		try {
			fis = new FileInputStream(jsonFilePath);
			currency = new Currency[2];
			client = new Client[2];
			clientDetails = new ClientDetails[2];
			for(int i=0; i<2; i++) {
				
				currency[i] = new Currency();
				client[i] = new Client();
				clientDetails[i] = new ClientDetails();
			}
			ObjectMapper mapper = new ObjectMapper();
			clientDetails = mapper.readValue(fis, ClientDetails[].class);
			System.out.println(clientDetails[0].getClient().getCurrency().getName());
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
