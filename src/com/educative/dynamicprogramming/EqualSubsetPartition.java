/**
 * 
 */
package com.educative.dynamicprogramming;

/**
 * @author narendradarla
 *
 */
public class EqualSubsetPartition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] num = {1,2,3,4};
		EqualSubsetPartition equalSubsetPartition = new EqualSubsetPartition();
		System.out.println("Can Partition Recursive = "+equalSubsetPartition.canPartitionRecursive(num));

	}

	private boolean canPartitionRecursive(int[] nums) {
		int sum = 0;
		for(int num:nums) {
			sum+= num;
		}
		if(sum%2 != 0) return false;
		return canPartitionRecursive(nums,sum/2, 0);
	}

	private boolean canPartitionRecursive(int[] nums, int sum, int index) {
		if(sum == 0) return true;
		
		if(nums.length == 0 || index>=nums.length) return false;
		
		if(nums[index]<= sum) {
			if(canPartitionRecursive(nums, sum-nums[index], index+1)) return true;
		}
		
		
		return canPartitionRecursive(nums, sum, index+1);
	}

}
