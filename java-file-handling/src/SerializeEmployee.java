import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeEmployee {

	public static void main(String[] args) {
		new SerializeEmployee();
	}

	
	public SerializeEmployee() {
//		create an employee object
		Employee e = new Employee(1, "vinodh", "vinodh@simplilearn.com", "11223456");
		
		List<Employee> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(new Employee(1, "vinodh", "vinodh@simplilearn.com", "11223456"));
		listOfEmployees.add(new Employee(2, "kumar", "kumar@simplilearn.com", "11223456"));
		try {
			//output stream chaining
			FileOutputStream f = new FileOutputStream("employees.ser");
			ObjectOutputStream s = new ObjectOutputStream(f);
			//s.writeObject(e);
			s.writeObject(listOfEmployees);
			s.close();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
