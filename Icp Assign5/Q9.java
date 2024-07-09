package Threaddemo1;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the value of n from the user
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Initialize the sum variable
        int sum = 0;

        // Calculate the sum of the series
        for (int i = 1; i <= n; i++) {
            sum += 1 + (i * i);
        }

        // Print the result
        System.out.println("The sum of the series is: " + sum);
    }
}
