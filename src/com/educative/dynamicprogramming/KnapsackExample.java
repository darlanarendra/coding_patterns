package com.educative.dynamicprogramming;

public class KnapsackExample {
/*
 * Given the weights and profits of ‘N’ items, we are asked to put these items in a knapsack that has a capacity ‘C’. The goal is to get the maximum profit from the items in the knapsack. Each item can only be selected once, as we don’t have multiple quantities of any item.

	Let’s take Merry’s example, who wants to carry some fruits in the knapsack to get maximum profit. Here are the weights and profits of the fruits:

	Items: { Apple, Orange, Banana, Melon }
	Weights: { 2, 3, 1, 4 }
	Profits: { 4, 5, 3, 7 }
	Knapsack capacity: 5
 */
	public static void main(String[] args) {
		int weights [] = {1,2,3};
		int credits [] = {3,4,5};
		int capacity = 5;
		KnapsackExample knapsackExample = new KnapsackExample();
		System.out.println("Knapsack Example Result"+knapsackExample.solveKnapsack(weights, credits, capacity));
	}
	
	public int solveKnapsack(int [] weights, int [] credits, int capacity) {
		return knapsackRecursive(weights, credits, capacity,0);	
	}
	
	private int knapsackRecursive(int[] weights, int [] credits, int capacity, int index) {
		if(capacity <= 0 || index>= credits.length) return 0;
		int credits1 = 0;
		if(weights[index]<=capacity) {
			credits1 = credits[index]+knapsackRecursive(weights, credits, capacity-weights[index], index+1);
		}
		int credits2 = knapsackRecursive(weights, credits, capacity, index+1);
		return Math.max(credits1,credits2);
	}
	
	
	//Time Complextity os 2(n)
}
