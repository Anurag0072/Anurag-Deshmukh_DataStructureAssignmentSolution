package com.service;

import java.util.*;

public class FloorsCalculate {
	public static void performConstructions(int Floor[]) {
		PriorityQueue<Integer> q1 = new PriorityQueue<>(Collections.reverseOrder());
		
		
		int max = Floor.length;
		for(int i=0; i<= max; i++) {
			q1.add(Floor[i]);
			System.out.println("Day "+ (i+1));
			while(!q1.isEmpty() && q1.peek() == max) {
				System.out.println(q1.poll() + " ");
				max--;
			}
		}
		System.out.println();
	}

}
