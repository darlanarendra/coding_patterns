package com.leetcode.revision;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    private int top ;
    
    public MyStack(){
        
    }
    public void push(int x){
        q1.add(x);
        top = x;
    }
    
    public int pop(){
        int myTop = top;
        while(q1.size()>1){
            top = q1.remove();
            q2.add(top);
        }
        q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return myTop;
    }
    
    public int top(){
        return top;
    }
    
    
    public boolean empty(){
        return q1.isEmpty();
    }
}