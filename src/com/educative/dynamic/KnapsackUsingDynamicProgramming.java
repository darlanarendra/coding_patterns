/**
 * 
 */
package com.educative.dynamic;

/**
 * @author narendradarla
 *
 */
public class KnapsackUsingDynamicProgramming {

	public int solveKnapsack(int [] weights, int [] credits, int capacity) {
		Integer [][] dp = new Integer[credits.length][capacity+1];
		return knapsackRecursive(dp,weights, credits, capacity,0);	
	}
	
	private int knapsackRecursive(Integer[][]dp, int[] weights, int [] credits, int capacity, int index) {
		if(capacity <= 0 || index>= credits.length) return 0;
		int credits1 = 0;
		
		if(dp[index][capacity] != null) {
			return dp[index][capacity];
		}
		if(weights[index]<=capacity) {
			credits1 = credits[index]+knapsackRecursive(dp,weights, credits, capacity-weights[index], index+1);
		}
		int credits2 = knapsackRecursive(dp, weights, credits, capacity, index+1);
		dp[index][capacity] =  Math.max(credits1,credits2);
		return dp[index][capacity];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int weights [] = {1,2,3};
		int credits [] = {3,4,5};
		int capacity = 5;
		KnapsackExample knapsackExample = new KnapsackExample();
		System.out.println("Knapsack Example Result "+knapsackExample.solveKnapsack(weights, credits, capacity));


	}
	
	//Time complexity is : NxC 

}
