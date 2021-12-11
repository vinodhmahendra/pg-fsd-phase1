
public class Employee {

	private String name;
	private Role role;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void promoteToManager() {
		role = new Manager();
	}
	
	//declare rule
	public void promoteToCEO() throws CustomException{
		
		if (role == null || !role.getRoleName().equals("Manager")) {
			throw new CustomException("only a manager can be promoted to CEOs");
		}
		role = new CEO();
	}
	
	public String getTitle() {
		if ( role == null ) {
			return "Employee";
		}else {
			return role.getRoleName();
		}
	}
}
