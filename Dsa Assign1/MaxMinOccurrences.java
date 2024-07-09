/*Write a java program to find the maximum and minimum and how many times they both occur
in an array of n elements. Find out the positions where the maximum first occurs and the
minimum last occurs. */
package normalprog;
import java.util.Scanner;

public class MaxMinOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of elements
        System.out.print("Enter number of elements of Array: ");
        int n = sc.nextInt();

        // Input the elements of the array
        System.out.print("Enter elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize variables to hold max, min, maxCount, minCount, maxFirstOccurrence, minLastOccurrence
        int max = arr[0];
        int min = arr[0];
        int maxCount = 1;
        int minCount = 1;
        int maxFirstOccurrence = 1;
        int minLastOccurrence = 1;

        // Loop through the array to find max, min, and their occurrences
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxCount = 1;
                maxFirstOccurrence = i + 1;
            } else if (arr[i] == max) {
                maxCount++;
            }

            if (arr[i] < min) {
                min = arr[i];
                minCount = 1;
                minLastOccurrence = i + 1;
            } else if (arr[i] == min) {
                minCount++;
                minLastOccurrence = i + 1; // Update last occurrence of min
            }
        }

        // Output the results
        System.out.println("Maximum element of Array is " + max + " and occurs " + maxCount + " times.");
        System.out.println("Minimum element of Array is " + min + " and occurs " + minCount + " times.");
        System.out.println("First occurrence of maximum element is at position " + maxFirstOccurrence + ".");
        System.out.println("Last occurrence of minimum element is at position " + minLastOccurrence + ".");
    }
}
