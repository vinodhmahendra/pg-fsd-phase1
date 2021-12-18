import java.util.Arrays;

public class CopyingArrays {

	public static void main(String[] args) {
		int[] src = {1,2,3,4,5,6};
		int srcPos = 0;
		
		int[] dest = {10,9,8,7,6,5,4,3,2,1};
		int destPos = 0;
		
		int length = src.length;
		System.out.println(Arrays.toString(dest));
		System.arraycopy(src, srcPos, dest, destPos, length);
		System.out.println(Arrays.toString(dest));

	}

}
