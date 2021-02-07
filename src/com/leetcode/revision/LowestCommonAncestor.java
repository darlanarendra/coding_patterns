package com.leetcode.revision;
/*
 * 1650. Lowest Common Ancestor of a Binary Tree III
 */
public class LowestCommonAncestor {

	public Node lowestCommonAncestor(Node p, Node q) {
		Node a = p; Node b = q;
		while(a!=b) {
			a = a == null? q:a.parent;
			b = b == null? p:b.parent;
		}
		return a;
	}

}
class Node{
	Node left;
	Node right;
	Node parent;
	int val;	
}