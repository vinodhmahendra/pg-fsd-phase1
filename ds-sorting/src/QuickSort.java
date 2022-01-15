import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] array = { 9, 6, 7, 2, 1, 4, 3, 8, 5, 10 };
		System.out.println(Arrays.toString(array));
		sort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));

	}
	//quick sort
	private static void sort(int[] array, int start, int end) {
		if  ( start < end ) {
			int pivot = partition(array,start,end);
			sort(array,start,pivot-1);
			sort(array,pivot+1,end);
		}
	}
	private static int partition(int[] array, int start, int end) {
		int pivot = end;
		int i = start -1;
		for ( int  j = start ; j <= end; j++) {
			if ( array[j] <= array[pivot]) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		return i;
	}

}
