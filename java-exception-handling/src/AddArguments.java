
public class AddArguments {

	public static void main(String[] args) {
		
//		int sum = 0;
//		for ( String element : args) {
//			sum = sum + Integer.parseInt(element);
//		}
//		System.out.println("Sum = " + sum);
		
//		try {
//			int sum = 0;
//			for ( String element : args) {
//				sum = sum + Integer.parseInt(element);
//			}
//			System.out.println("Sum = " + sum);
//		}catch(NumberFormatException nfe) {
//			System.err.println("one of the command-line arguments is not an integer");
//		}catch (Exception e) {
//			//some exception handling code
//		}
		
		//Enhanced Code 
		
		int sum = 0;
		for ( String element : args) {
			try {
				sum += Integer.parseInt(element);
			}catch(NumberFormatException nfe) {
				System.err.println("[ " +element + " ] is not an integer and will not be included in the sum.");
			}
		}
		System.out.println("Sum = " + sum);
 	} 
}
