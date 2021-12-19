import java.util.Arrays;

public class OrderStatistics {

	public static void main(String[] args) {
		int[] input = {12,3,5,7,19};
		
		int k = 2;
		
		System.out.println("K'th  smallest element is "+kthSmallest(input,k));
	}
	
	static int kthSmallest(int[] array , int k) {
		
		System.out.println("Before Sorting: " + Arrays.toString(array));
		
		
		Arrays.sort(array);

		System.out.println("After Sorting: " + Arrays.toString(array));
		
		return array[k];
	}

}
