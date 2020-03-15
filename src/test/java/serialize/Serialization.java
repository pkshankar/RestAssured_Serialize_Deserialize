package serialize;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Pojo.Address;
import Pojo.Employee;
import Pojo.Propertiez;
import complexPojo_01.EmployeeDetails;
import complexPojo_02.Client;
import complexPojo_02.ClientDetails;
import complexPojo_02.Currency;

public class Serialization {

	@Test
	public void pojoToJsonEmployee() {

		long[] cellNo = { 998864422, 1234567890 };
		String[] cNames = { "Los Angeles", "New York" };
		Address address = new Address("El Camino Real", "San Jose", 95014);
		Propertiez properties = new Propertiez("29 years", "1000 USD");
		Employee employee = new Employee(123, "P K Shankar", true, address, cellNo, "Quality analyst", cNames,
				properties);
		ObjectMapper mapper = new ObjectMapper();
		try {
			String jsonString = mapper.writeValueAsString(employee);
			System.out.println(jsonString);
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}

	}

	@Test
	public void pojoToJsonEmployeeDetails() {

		EmployeeDetails[] employeeDetails = new EmployeeDetails[2];
		ObjectMapper mapper = new ObjectMapper();
		employeeDetails[0] = new EmployeeDetails("India", "Noida", 901, "agar", "vedi", "00000");
		employeeDetails[1] = new EmployeeDetails("Zambia", "Kabwe", 769, "Fon", "del", "00003");
		try {
			String jsonString = mapper.writeValueAsString(employeeDetails);
			System.out.println(jsonString);
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}

	}

	@Test
	public void pojoToJsonClient() {

		Currency[] currency = new Currency[2];
		Client[] client = new Client[2];
		ClientDetails[] clientDetails = new ClientDetails[2];
		currency[0] = new Currency("United States of America, Dollars", "$");
		currency[1] = new Currency("United States of America, Dollars", "$");
		client[0] = new Client(6364, "7Seven7 Insurance Inc", "donna@7seven7ins.com", currency[0], "941 Elm Ave. #5 ",
				"Long Beach", "CA", "90813", "United States", "941 Elm Ave. #5, Long Beach, CA, 90813, United States",
				"562-556-4035", "562-381-7500", "listed", "false", "2010-07-18T00:08:10Z", "2010-07-21T11:04:58Z");
		client[1] = new Client(6365, "Affinity", "CGregory@affinitygroup.com", currency[1], "2575 Vista Del Mar ", "Ventura",
				"California", "93001", "United States", "2575 Vista Del Mar, Ventura, California, 93001, United States",
				"(270) 901-2913", null, null, null, "2010-07-18T00:08:10Z", "2010-07-18T00:08:10Z");
		clientDetails[0] = new ClientDetails(client[0]);
		clientDetails[1] = new ClientDetails(client[1]);
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			String jsonString = mapper.writeValueAsString(clientDetails);
			System.out.println(jsonString);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}

	}

}
