public class Insertion {
	
	static void sort (int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i] , j = i;
			while ( j > 0 && arr[j-1] > temp) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {10,3,2,5,8,4,6,1};
		printArray(arr);
		sort(arr);
		printArray(arr);
		

	}


	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
