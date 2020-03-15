package Pojo;

public class Employee {

	private int id;
	private String name;
	private boolean permanent;
	private Address address;
	private long[] phoneNumbers;
	private String role;
	private String[] cities;
	private Propertiez properties;
	
	public Employee(int id, String name, boolean permanent, Address address, long[] phoneNumbers, String role,
			String[] cities, Propertiez properties) {
		
		this.id = id;
		this.name = name;
		this.permanent = permanent;
		this.address = address;
		this.phoneNumbers = phoneNumbers;
		this.role = role;
		this.cities = cities;
		this.properties = properties;
	}
	
	public Employee() {
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isPermanent() {
		return permanent;
	}

	public Address getAddress() {
		return address;
	}

	public long[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public String getRole() {
		return role;
	}

	public String[] getCities() {
		return cities;
	}

	public Propertiez getProperties() {
		return properties;
	}
	
	

	
}
