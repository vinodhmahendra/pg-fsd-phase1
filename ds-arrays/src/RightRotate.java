import java.util.Arrays;

public class RightRotate {

	public static void main(String[] args) {
		int[] array = {9,8,7,6,5,4,3,2,1};
		
		int rotateArray = 2;
		
		System.out.println(Arrays.toString(array));
		
		for ( int i = 0 ; i < rotateArray ; i++) {
			
			int last = array[array.length-1];
			
			for ( int j = array.length -1 ; j  > 0; j--) {
				array[j] = array[j-1];
			}
			
			array[0] = last;
		}
		
		System.out.println(Arrays.toString(array));

	}

}
