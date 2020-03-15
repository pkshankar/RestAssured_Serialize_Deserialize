package complexPojo_04;

public class EmployeeDetails {

	private _Meta _meta;
	private Result[] result;

	public EmployeeDetails(_Meta _meta, Result[] result) {

		this._meta = _meta;
		this.result = result;
	}

	public EmployeeDetails() {

	}

	public _Meta get_meta() {
		return _meta;
	}

	public Result[] getResult() {
		return result;
	}

}
