package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {12, 25, 12, 56, 89, 25};
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length-1; i++) {
			//System.out.println(nums[i]);
			
			if (nums[i]==nums[i+1]) {
				System.out.println(nums[i]+" is a duplicate number");	
			
			}
	}
	}

}
