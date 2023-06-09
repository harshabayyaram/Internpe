package com.harsha.internpe;

public class Task4 {
	    public static int findDuplicate(int[] nums) {
	        for (int i = 0; i < nums.length; i++) {
	            int current = Math.abs(nums[i]);
	            if (nums[current] < 0) {
	                return current;
	            } else {
	                nums[current] = -nums[current];
	            }
	        }
	        return -1;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {1, 3, 4, 2, 2, 3, 3, 4}; // Example array with a single duplicate
	        int duplicate = findDuplicate(nums);
	        System.out.println("Duplicate number: " + duplicate);
	    }
}
