package com.leetcode.revision;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap<Integer, Integer> {

	int capacity;
	public LRUCache(int capacity) {
		super(capacity,0.75f,true);
		this.capacity = capacity;
	}
	
	public int get(int key) {
		return super.get(key);
	}
	
	public void put(int key, int value) {
		super.put(key, value);
	}
	
	public boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest) {
		return size() > capacity;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
