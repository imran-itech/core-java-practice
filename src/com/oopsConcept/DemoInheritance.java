package com.oopsConcept;

public class DemoInheritance {
    public static void main(String[] args) {
        int[] lectures = {30, 10, 40, 20, 50}; // Given lecture sequence
        int n = lectures.length;

        // Compute the prefix sum array
        int[] prefixSum = new int[n];
        prefixSum[0] = lectures[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + lectures[i];
        }

        int minFrequency = Integer.MAX_VALUE;
        int divisionPoint = 0;

        // Check all possible division points
        for (int i = 0; i < n - 1; i++) {
            int sumDay1 = prefixSum[i];
            int sumDay2 = prefixSum[n - 1] - prefixSum[i];
            int maxFrequency = Math.max(sumDay1, sumDay2);

            if (maxFrequency < minFrequency) {
                minFrequency = maxFrequency;
                divisionPoint = i;
            }
        }

        // Output the optimal division
        System.out.println("Minimum Frequency: " + minFrequency);
        System.out.print("Day 1 Lectures: ");
        for (int i = 0; i <= divisionPoint; i++) {
            System.out.print(lectures[i] + " ");
        }
        System.out.println();
        System.out.print("Day 2 Lectures: ");
        for (int i = divisionPoint + 1; i < n; i++) {
            System.out.print(lectures[i] + " ");
        }
        System.out.println();
    }
}

