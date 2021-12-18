

/// 8 primitive's  example : char
public class PrimitiveArray {

	public char[] createArray() {
		char[] s;
		
		s= new char[26];
		
		for (int i = 0; i < 26 ; i++) {
			s[i] = (char) ('A' +i);
		}
		return  s;
	}
	
	public void printArrayElement(char[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
}
