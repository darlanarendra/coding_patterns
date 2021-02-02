package com.educative.dynamicprogramming;

public class KnapsackUnlimited {
/*
 * Items: { Apple, Orange, Melon }
Weights: { 1, 2, 3 }
Profits: { 15, 20, 50 }
Knapsack capacity: 5
 */

	public static void main(String[] args) {
	
		int[] profits = { 15, 50, 60, 90 };
	    int[] weights = { 1, 3, 4, 5 };
		int K = 8;
		System.out.println("KnapsackUnlimited -> "+knapsackStart(weights,profits,K));
	}
	
	static int knapsackRecursive(int [] weights, int [] profits, int capacity, int index) {
		if(capacity<= 0 || index >= profits.length|| profits.length == 0|| weights.length != profits.length)
			return 0;
		int profit1 = 0;
		
		if(weights[index]<=capacity)
			profit1 = profits[index]+ knapsackRecursive(weights,profits, capacity-weights[index], index);
				
		int profit2 = knapsackRecursive(weights,profits, capacity, index+1);
		
		return Math.max(profit1, profit2);
	}
	
	static int knapsackStart(int [] weights, int [] profits, int capacity) {
		
		return knapsackRecursive(weights, profits, capacity, 0);
		
	}
	
	

}
