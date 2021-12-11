
public class Manager  implements Role{
	
	

	@Override
	public String getRoleName() {
		
		return "Manager";
	}

	@Override
	public String getResponibility() {
		return "Manages a department";
	}

}
