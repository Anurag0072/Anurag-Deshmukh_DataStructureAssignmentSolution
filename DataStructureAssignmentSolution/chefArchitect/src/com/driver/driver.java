package com.driver;

import java.util.Scanner;

import com.service.FloorsCalculate;

public class driver {
	public static void main(String[] args) {
		System.out.println("Enter the total number of floors in the building: ");
		Scanner sc = new Scanner(System.in) ;
		int N = sc.nextInt();
		int []Floors = new int[N];
		for(int i =0; i< N; i++) {
			System.out.println("Enter the size of floor on day:"+ (i+1));
			int floorSize = sc.nextInt();
			Floors[i] = floorSize;
		}
		FloorsCalculate fc = new FloorsCalculate();
		fc.performConstructions(Floors);
		
			
		}
	}


