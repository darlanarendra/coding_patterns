package com.educative.dynamicprogramming;

import java.util.Stack;

public class MyQueue {

	Stack<Integer> inputStack = new Stack<>();
	Stack<Integer> outputStack = new Stack<>();
	

	public void push(int x) {
		
	}
	
	public int pop(){
		if(empty()) return -1;
		constructOutputStack();
		return outputStack.pop();	
	}
	
	public int peek() {
		constructOutputStack();
		return outputStack.peek();
	}
	
	public boolean empty() {
		return inputStack.isEmpty()&& outputStack.isEmpty();
	}
	
	
	private void constructOutputStack() {
		while(!inputStack.isEmpty()) {
			outputStack.add(inputStack.pop());
		}
	}
	
	private void constructInputStack() {
		while(!outputStack.isEmpty()) {
			inputStack.add(outputStack.pop());
		}
	}
	
	//1,2,3
}
