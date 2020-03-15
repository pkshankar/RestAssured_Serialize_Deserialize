package complexPojo_02;

public class Client {
	
	private int id;
	private String name;
	private String email;
	private Currency currency;
	private String address;
	private String city;
	private String province;
	private String zip_code;
	private String country;
	private String full_address_with_comma;
	private String phone;
	private String fax;
	private String custom_field_name;
	private String custom_field_value;
	private String created_at;
	private String updated_at;
	
	public Client(int id, String name, String email, Currency currency, String address, String city, String province,
			String zip_code, String country, String full_address_with_comma, String phone, String fax,
			String custom_field_name, String custom_field_value, String created_at, String updated_at) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.currency = currency;
		this.address = address;
		this.city = city;
		this.province = province;
		this.zip_code = zip_code;
		this.country = country;
		this.full_address_with_comma = full_address_with_comma;
		this.phone = phone;
		this.fax = fax;
		this.custom_field_name = custom_field_name;
		this.custom_field_value = custom_field_value;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	
	public Client() {
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Currency getCurrency() {
		return currency;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getProvince() {
		return province;
	}

	public String getZip_code() {
		return zip_code;
	}

	public String getCountry() {
		return country;
	}

	public String getFull_address_with_comma() {
		return full_address_with_comma;
	}

	public String getPhone() {
		return phone;
	}

	public String getFax() {
		return fax;
	}

	public String getCustom_field_name() {
		return custom_field_name;
	}

	public String getCustom_field_value() {
		return custom_field_value;
	}

	public String getCreated_at() {
		return created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}
	
	
	
	

}
