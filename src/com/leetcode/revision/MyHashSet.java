package com.leetcode.revision;

public class MyHashSet {

	boolean [] a;
	
	public MyHashSet() {
		a = new boolean[300001];
	}
	void add(int key) {
		a[key] = true;
	}
	
	boolean contains(int key) {
		return a[key];
	}
	
	void remove(int key) {
		a[key] = false;
	}
}
