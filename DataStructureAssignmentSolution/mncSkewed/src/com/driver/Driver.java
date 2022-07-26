package com.driver;

import com.service.Node;
import com.service.Service;
import com.service.Skewed;

public class Driver {
	public static void main(String[] args) {
		Service tree = new Service();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		
		int ascending = 0;
		tree.BtoS(tree.node , ascending);
		Skewed sr = new Skewed();
		sr.RSkewed(tree.headN);
		
	}
	

}
