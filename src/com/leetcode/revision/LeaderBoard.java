package com.leetcode.revision;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
/*
1244.Design a Leaderboard class, which has 3 functions:

addScore(playerId, score): Update the leaderboard by adding score to the given player's score. If there is no player with such id in the leaderboard, add him to the leaderboard with the given score.
top(K): Return the score sum of the top K players.
reset(playerId): Reset the score of the player with the given id to 0 (in other words erase it from the leaderboard). It is guaranteed that the player was added to the leaderboard before calling this function.
Initially, the leaderboard is empty.
 
 */
class Leaderboard {

    HashMap<Integer,Integer> scores;
    public Leaderboard() {
        scores =  new HashMap<>();
    }
    
    public void addScore(int playerId, int score) {
        if(!scores.containsKey(playerId)){
            this.scores.put(playerId,0);
        } 
        scores.put(playerId, scores.get(playerId)+score);       
    }
    
    public int top(int K) {
        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((a,b)->a.getValue() -b.getValue());
        for(Map.Entry<Integer,Integer> entry: scores.entrySet()){
            heap.offer(entry);
            if(heap.size()>K){
                heap.poll();
            }
        }
        
        int total = 0;
        Iterator value = heap.iterator();
        while(value.hasNext()){
            total+= ((Map.Entry<Integer,Integer>)value.next()).getValue();
        }
        
        return total;
    }
    
    public void reset(int playerId) {
        scores.put(playerId,0);
    }
}