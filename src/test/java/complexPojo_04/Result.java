package complexPojo_04;

public class Result {

	private String id;
	private String first_name;
	private String last_name;
	private String gender;
	private String dob;
	private String email;
	private String phone;
	private String website;
	private String address;
	private String status;
	private _Links _links;

	public Result(String id, String first_name, String last_name, String gender, String dob, String email, String phone,
			String website, String address, String status, _Links _links) {

		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
		this.phone = phone;
		this.website = website;
		this.address = address;
		this.status = status;
		this._links = _links;
	}

	public Result() {

	}

	public String getId() {
		return id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getGender() {
		return gender;
	}

	public String getDob() {
		return dob;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getWebsite() {
		return website;
	}

	public String getAddress() {
		return address;
	}

	public String getStatus() {
		return status;
	}

	public _Links get_links() {
		return _links;
	}

	
}
