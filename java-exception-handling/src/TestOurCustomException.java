
public class TestOurCustomException {

	public static void main(String[] args) {
		Employee employee = new Employee("Tom");
		System.out.println("Name:" + employee.getName());
		System.out.println("Role : " + employee.getTitle());

		System.out.println("Promote tom to CEO");
		try {
			employee.promoteToCEO();
		} catch (CustomException e) {
			System.out.println("Error : " +e.getMessage());
		}
		
		Employee employee2 = new Employee("clarence");
		System.out.println("Name:" + employee2.getName());
		System.out.println("Role (initial) : " + employee2.getTitle());
		employee2.promoteToManager();
		System.out.println("Role : " + employee2.getTitle());
		try {
			employee2.promoteToCEO();
		} catch (CustomException e) {
			System.out.println("Error : " +e.getMessage());
		}
		System.out.println("Role : " + employee2.getTitle());

	}

}
