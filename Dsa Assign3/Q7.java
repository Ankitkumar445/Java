/*Write a recursive method in Java that computes the factorial of a given integer. */
package Assing3;

public class Q7 {
    public static void main(String[] args) {
        int n = 4;
            System.out.println("Factorial of " + n + " is: " + factorial(n));
        }

        // Recursive method to compute factorial
        public static int factorial(int n) {
            // Base case: factorial of 0 is 1
            if (n == 0)
                return 1;
                // Recursive case: factorial of n is n multiplied by factorial of n-1
            else
                return n * factorial(n - 1);
        }
    }