package com.oopsConcept;

import java.util.Arrays;

public class Demo2 {

	public static void main(String []args){
		int[] vehicles={2,6,10,19};
		int n=3;
		
		
		int minRoofLength =findMinmumRoofLength(vehicles,n);
		 System.out.println("Minimum roof length to cover " + n + " vehicles: " + minRoofLength);
	}

	public static int findMinmumRoofLength(int[] vehicles, int n) {
		if (vehicles == null || vehicles.length == 0 || n <= 0 || n > vehicles.length) {
			throw new IllegalArgumentException("Invalid input");
		}

		Arrays.sort(vehicles);

		int minRoofLength = Integer.MAX_VALUE;

		for (int i = 0; i <= vehicles.length - n; i++) {
			int currentRoofLength = vehicles[i + n - 1] - vehicles[i];
			if (currentRoofLength < minRoofLength) {
				minRoofLength = currentRoofLength;
			}
		}
		return minRoofLength + 1;
}
}

