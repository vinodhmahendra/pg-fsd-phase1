
public class AddArguments {

	public static void main(String[] args) {
		int sum = 0;
		for ( String element : args) {
			sum = sum + Integer.parseInt(element);
		}
		System.out.println("Sum = " + sum);
	}

}
