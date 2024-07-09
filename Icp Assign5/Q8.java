package Threaddemo1;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Initialize sum to 0
        int sum = 0;

        // Calculate the sum of the series
        for (int i = 1; i <= n; i++) {
            sum += (i * (i + 1)) / 2;
        }

        // Display the result
        System.out.println("The sum of the series is: " + sum);
    }
}

