
public class RangeQuerys {

	public static void main(String[] args) {
		int l  = 2, r = 5;
		System.out.println("Sum of Natural numbers for L to R is: " + sumInRange(l,r));

	}

	private static int sumInRange(int l, int r) {
		// TODO Auto-generated method stub
		return sumNatural(r) - sumNatural(l-1);
	}

	private static int sumNatural(int n) {
		int sum = (n* (n+1))/2;
		
		return sum;
	}

}
