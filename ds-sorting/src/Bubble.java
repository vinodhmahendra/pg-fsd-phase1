import java.util.Arrays;

public class Bubble {
	
	static void sort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1;j++) {
				if ( array[j] > array[j+1]) {
					int temp = array[j];
					array[j] =array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {3,1,2};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
