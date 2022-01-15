import java.util.Arrays;

public class MergeSort {

	//merge sort
	public static void sort(int[] array , int left , int right) {
		if ( right > left) {
			int m = ( left + right ) / 2;
			sort(array,left,m);
			sort(array,m+1,right);
			merge (array,left,m,right);
		}
	}
	
	private static void merge(int[] array, int left, int middle, int right) {
		int[]  leftTmpArray = new int[middle-left+2];
		int[] rightTmpArray = new int[right-middle+1];
		
		for(int i = 0 ; i <= middle-left ; i++) {
			leftTmpArray[i] = array [left+i];
		}
		
		for(int i = 0 ; i < right-middle;i++) {
			rightTmpArray[i] = array[middle+1+i];
		}
		
		leftTmpArray[middle - left+1] = Integer.MAX_VALUE;
		rightTmpArray[right - middle] = Integer.MAX_VALUE;
		
		int i  = 0, j = 0;
		for ( int k = left ; k <=right ; k++) {
			if ( leftTmpArray[i] < rightTmpArray[j]) {
				array[k] = leftTmpArray[i];
				i++;
			}else {
				array[k] = rightTmpArray[j];
				j++;
			}
		}
	}

	public static void main(String[] args) {
		
		int[] array = {9,6,7,2,1,4,3,8,5,10};
		System.out.println(Arrays.toString(array));
		sort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
		
	}

}
