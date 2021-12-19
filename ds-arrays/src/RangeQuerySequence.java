import java.util.ArrayList;
import java.util.List;

public class RangeQuerySequence {

	public static void main(String[] args) {
		
		//initialize the range
		int L = 0, R = 5;
		
		System.out.println(findSum(L,R));

	}
	
	static int findSum(int L , int R) {
		
		List<Integer> array = new ArrayList<>();
		
		int i = 0;
		int x = 2;
		while ( i <= R) {
			array.add(i+x);
			
			if (i + 1 <= R) 
				array.add(i + 1 + x);
			
			
			 x *= -1;
			 
			 i += 2;
			
		}
		
		int sum = 0;
		
		System.out.println(array);
		
		for (int j = L; j <= R; ++j) {
			sum += array.get(j);
		}
		
		return sum;
	}

}
