package detailsPojo;

public class Person {

	private String first_name;
	private String last_name;
	private String gender;
	private String email;
	private String status;

	public Person(String first_name, String last_name, String gender, String email, String status) {

		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.email = email;
		this.status = status;
	}

	public Person() {

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

	public String getEmail() {
		return email;
	}

	public String getStatus() {
		return status;
	}

}
