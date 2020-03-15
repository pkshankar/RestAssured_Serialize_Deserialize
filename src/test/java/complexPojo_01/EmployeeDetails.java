package complexPojo_01;

public class EmployeeDetails {

	private String country;
	private String empLocation;
	private int emp_ID;
	private String first_Name;
	private String last_Name;
	private String emp;

	public EmployeeDetails(String country, String empLocation, int emp_ID, String first_Name, String last_Name,
			String emp) {

		this.country = country;
		this.empLocation = empLocation;
		this.emp_ID = emp_ID;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.emp = emp;
	}

	public EmployeeDetails() {

	}

	public String getCountry() {
		return country;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public int getEmp_ID() {
		return emp_ID;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public String getEmp() {
		return emp;
	}

}
