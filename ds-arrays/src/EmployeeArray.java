
public class EmployeeArray {
	
	public Employee[] createArray() {
//		Employee e[];
//		e = new Employee[3];
//		
//		e[0] = new Employee(1, "x", "x", 100);
//		e[1] = new Employee(2, "y", "y", 200);
//		e[2] = new Employee(3, "Z", "z", 300);
		
		Employee[] e = {
				new Employee(1, "x", "12536251", 217682),
				new Employee(2,"y","12728",358621)
		};
		
		return e;
	}
	
	public void printArrayElement(Employee[] list) {
		
		for(Employee e : list) {
			System.out.println(e);
		}
	}

}
