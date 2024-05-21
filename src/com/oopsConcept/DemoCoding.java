package com.oopsConcept;

import java.util.Arrays;

public class DemoCoding {

	    public static void main(String[] args) {
	        int[] vehicles = {2, 6, 10, 19}; // Given vehicle positions
	        int k = 3; // Number of vehicles to cover

	        // Find the minimum roof length
	        int minRoofLength = findMinRoofLength(vehicles, k);
	        System.out.println("Minimum roof length to cover " + k + " vehicles: " + minRoofLength);
	    }

	    public static int findMinRoofLength(int[] vehicles, int k) {
	        if (vehicles == null || vehicles.length == 0 || k <= 0 || k > vehicles.length) {
	            throw new IllegalArgumentException("Invalid input.");
	        }

	        // Sort the vehicle positions
	        Arrays.sort(vehicles);

	        int minRoofLength = Integer.MAX_VALUE;

	        // Use a sliding window to find the minimum length of roof to cover k vehicles
	        for (int i = 0; i <= vehicles.length - k; i++) {
	            int currentRoofLength = vehicles[i + k - 1] - vehicles[i];
	            if (currentRoofLength < minRoofLength) {
	                minRoofLength = currentRoofLength;
	            }
	        }

	        return minRoofLength + 1; // +1 because the roof length includes both end positions
	    }
	}


