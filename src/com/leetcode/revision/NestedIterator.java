package com.leetcode.revision;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
/**
 * 341. Flatten Nested List Iterator
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer>{

	Deque<NestedInteger> stack = new ArrayDeque<>();
	public NestedIterator(List<NestedInteger> list) {
		prepareStack(list);
	}

	private void prepareStack(List<NestedInteger> list) {
		for(int i = list.size()-1; i>=0; i--) {
			stack.push(list.get(i));
		}
		
	}

	@Override
	public boolean hasNext() {
		while(!stack.isEmpty() && !stack.peek().isInteger()) {
			prepareStack(stack.pop().getList());
		}
		return !stack.isEmpty();
	}

	@Override
	public Integer next() {
		if(!hasNext()) {
			return null;
		}
		return stack.pop().getInteger();
	}

}

interface NestedInteger {

	 // @return true if this NestedInteger holds a single integer, rather than a nested list.
     public boolean isInteger();
	 
	 // @return the single integer that this NestedInteger holds, if it holds a single integer
     // Return null if this NestedInteger holds a nested list
     public Integer getInteger();
	 
	 // @return the nested list that this NestedInteger holds, if it holds a nested list
	 // Return empty list if this NestedInteger holds a single integer
	 public List<NestedInteger> getList();
	    
}
