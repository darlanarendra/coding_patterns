package com.educative.dynamicprogramming;

public class MyHashmap {
	
	
	
	//Key , value pairs 
	//Give Key , we should get Value 
	//Remove key 
	//Insert Key , Value 
	int [] map;
	public MyHashmap() {
		map = new int[1000001];
		for(int i= 0; i<map.length;i++) {
			map[i] = -1;
		}
	}
	
	public void put(int key, int value) {
		map[key] = value;
	}
	
	public int get(int key) {
		if(map[key] != -1)
			return map[key];
		else 
			return -1;
	}
	
	public void remove(int key) {
		if(map[key]!= -1)
			map[key] = -1;
	}
	
}
