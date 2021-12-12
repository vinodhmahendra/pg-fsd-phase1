
public class Manager  implements Role{
	
	

	public Manager() {
		super();
	
	}

	@Override
	public String getRoleName() {
		
		return "Manager";
	}

	@Override
	public String getResponibility() {
		return "Manages a department";
	}

}
