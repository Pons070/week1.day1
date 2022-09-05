package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {22, 3981, -19, 82, 0, 45, 37};
		
		Arrays.sort(nums);
		
		//for (int i = 0; i < nums.length; i++) {
			
			
			//System.out.println(nums[i]);
			
		//}
		System.out.println(nums[0]);
	System.out.println(nums[nums.length-1]);
	}

}
