import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.ListIterator;

public class DeSerializeEmployee {

	public static void main(String[] args) {
		new DeSerializeEmployee();
	}

	public DeSerializeEmployee() {
		List<Employee> listOfEmployees = null;

		try {
			FileInputStream f = new FileInputStream("employees.ser");
			ObjectInputStream s = new ObjectInputStream(f);

			listOfEmployees = (List) s.readObject();

			s.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		for (Employee e : listOfEmployees) {
			System.out.println("Deseiralized employee object from employees.ser");
			System.out.println(e.toString());
		}
		
//		ListIterator<Employee> i = listOfEmployees.listIterator();
//		
//		while(i.hasNext()) {
//			
//			Employee e = i.next();
//			if ( e.getId() == 1) {
//				//remove or update
// 				
//			}
//			
//			i.remove();
//		}
	}

}
