
public class ThrowingException {

	public static void main(String[] args) {
		try {
		getArrayItem();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array item was out of bounds");
		}
	}

	private static void getArrayItem() {
		String[] strings = {"welcome!"};
		System.out.println(strings[1]);
	}
}
