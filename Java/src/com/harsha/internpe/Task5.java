package com.harsha.internpe;

public class Task5 {
	    public static int findNonUniqueDuplicate(int[] nums) {
	        int n = nums.length;
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (nums[i] == nums[j]) {
	                    return nums[i];
	                }
	            }
	        }
	        return -1;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {1, 3, 4, 2, 2, 3, 3, 4};
	        int nonUniqueDuplicate = findNonUniqueDuplicate(nums);
	        System.out.println("Non-unique duplicate number: " + nonUniqueDuplicate);
	    }

}
