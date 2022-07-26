package com.service;

import com.service.Node;
//public class Node{
//	int value;
//	Node right, left;;
//	
//	Node(int item){
//		value = item;
//		left = right = null;
//	}
//}
public class Service {
	public static Node node;
	public static Node prevN = null;
	public static Node headN = null;
	
	
	//func to skewed the BST
	
	public static void BtoS(Node root, int ascending) {
		if(root == null) {
			return;
		}
		
		if(ascending > 0) {
			BtoS(root.right,ascending);
		}else {
			BtoS(root.left, ascending);
		}
		
		Node rightN = root.right;
		Node leftN = root.left;
		
		if(headN == null) {
			headN = root;
			root.left = null;
			prevN = root;
		}else {
			prevN.right = root;
			root.left = null;
			prevN = root;
		}
		
		if(ascending > 0) {
			BtoS(leftN, ascending);
		}else {
			BtoS(rightN, ascending);
		}
		
	}
	
	

}
