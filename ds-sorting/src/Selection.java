import java.util.Arrays;

public class Selection {
	
	static void sort(int[] array) {
		
		for (int j = 0; j < array.length; j++) {
			int minimumIndex = j;
			
			for (int i = j+1; i < array.length; i++) {
				if ( array[i] < array[minimumIndex]) {
					minimumIndex = i;
				}
			}
			
			if ( minimumIndex != j) {
				int temp = array[j];
				array[j] = array[minimumIndex];
				array[minimumIndex] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {3,1,2};
		System.out.println(Arrays.toString(array));
		sort(array);
		System.out.println(Arrays.toString(array));
	}

}
