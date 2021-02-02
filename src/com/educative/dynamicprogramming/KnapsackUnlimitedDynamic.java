package com.educative.dynamicprogramming;

public class KnapsackUnlimitedDynamic {

	

	
	public static void main(String [] args) {
		int[] profits = { 15, 50, 60, 90 };
	    int[] weights = { 1, 3, 4, 5 };
		int capacity = 8;
		System.out.println("KnapsackUnlimited -> "+solveKnapsack(weights,profits,capacity));
	}

	private static int solveKnapsack(int[] weights, int[] profits, int capacity) {
		
		Integer [][] dp = new Integer[weights.length][capacity+1];
		
		return solveKnapsackDynamic(weights, profits, capacity, 0, dp);
	}

	private static int solveKnapsackDynamic(int[] weights, int[] profits, 
			int capacity, int index, Integer[][] dp) {
	
		if(capacity<= 0 || profits.length == 0|| profits.length != weights.length || index>= profits.length)
			return 0;
		
		if(dp[index][capacity] == null) {
			int profit1 = 0;
			
			if(weights[index] <= capacity) {
				profit1 = profits[index] + solveKnapsackDynamic(weights, profits, capacity-weights[index], index, dp);
			}
			
			int profit2 = solveKnapsackDynamic(weights,profits, capacity, index+1, dp);
			dp[index][capacity] = Math.max(profit1,profit2);
		}
		return dp[index][capacity];
	}
}
