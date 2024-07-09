/*Amicable numbers are pair of numbers each of whose divisors are added to give the other 
number.  */
package ass5;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int x = sc.nextInt();
        int sum = 0; 

        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Enter second number :");
        int y = sc.nextInt(); 
        int sum2 = 0; 

        for (int i = 1; i <= y / 2; i++) {
            if (y % i == 0) {
                sum2 = sum2 + i;
            }
        }

        if (sum == y && sum2 == x) {
            System.out.println("Amicable");
        } else {
            System.out.println("Not Amicable");
        }

        sc.close(); 
    }
}
