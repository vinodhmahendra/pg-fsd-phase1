

public  class Employee {
	
	//fields
	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	
	//constructor
	public Employee(int empId, String name, String ssn, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}

	//methods
	public void changeName(String newName) {
		if ( newName != null) {
			this.name = newName;
		}
	}
	
	public void raiseSalary(double increase) {
		this.salary += increase;
	}

	@Override
	public String toString() {
		return String.format("Employee [empId=%s, name=%s, ssn=%s, salary=%s]", empId, name, ssn, salary);
	}
	
	
	

}
