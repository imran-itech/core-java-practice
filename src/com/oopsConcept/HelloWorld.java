package com.oopsConcept;

public class HelloWorld {

	    public static void main(String[] args) {
	        int[] lectures = {30, 10, 40, 20, 50}; // Given lecture sequence

	        // Find the minimum maximum frequency
	        int minMaxFrequency = findMinMaxFrequency(lectures);

	        System.out.println("Minimum maximum frequency: " + minMaxFrequency);
	    }

	    public static int findMinMaxFrequency(int[] lectures) {
	        int n = lectures.length;
	        int totalSum = 0;

	        for (int lecture : lectures) {
	            totalSum += lecture;
	        }

	        int minMaxFrequency = Integer.MAX_VALUE;

	        // Try splitting the lectures at every possible point
	        for (int i = 1; i < n; i++) {
	            int sumDay1 = 0;
	            for (int j = 0; j < i; j++) {
	                sumDay1 += lectures[j];
	            }
	            int sumDay2 = totalSum - sumDay1;

	            int currentMaxFrequency = Math.max(sumDay1, sumDay2);
	            minMaxFrequency = Math.min(minMaxFrequency, currentMaxFrequency);
	        }

	        return minMaxFrequency;
	    }
	}

