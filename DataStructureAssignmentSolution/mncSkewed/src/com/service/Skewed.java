package com.service;

public class Skewed {
	public static void RSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.value + " ");
		RSkewed(root.right);
	}

}
