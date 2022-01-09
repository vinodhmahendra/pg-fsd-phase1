
public class BinarySearch {
	
	public static int search(int[] arr,int value) {
		int start = 0;
		int end = arr.length-1;
		int middle = ( start + end) / 2;
		System.out.println(start + " " + middle + " " + end);
		
		while (arr[middle] != value) {
			if ( value  < arr[middle] ) {
				end = middle-1;
			}else {
				start = middle + 1;
			}
			middle = (start + end) / 2;
			System.out.println(start + " " + middle + " " + end);
		}
		
		return middle;
	}
}

//  8,9,12,15,17,19,20,21,28
//  S         M           E
