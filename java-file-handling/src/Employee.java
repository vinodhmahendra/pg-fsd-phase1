import java.io.Serializable;

public class Employee implements Serializable{
	
	private Integer id;
	private String name;
	private transient String email;
	private String phone;
	

	public Integer getId() {
		return id;
	}
	
	public Employee(Integer id, String name, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}




	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, email=%s, phone=%s]", id, name, email, phone);
	}
	

}
