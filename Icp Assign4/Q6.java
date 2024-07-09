/*Write a java program to enter two numbers through the keyboard. Write a program to find the 
value of one number raised to the power of another. (Do not use Java built-in method).
 */
package logic;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base :");
        int x =sc.nextInt();
        System.out.println("enter the power :");
        int y =sc.nextInt();
        double result = 1;
        for (int i = 0; i < Math.abs(y); i++) {
        	result *=x;
        }
        if (y < 0) {
        	result =1/result;
        }
        System.out.println(x + " raised to the power of " + y + " is: " + result);

	}

}
/*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the base number: ");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        // Calculate the power without using built-in methods
        double result = 1;

        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }

        // Handling negative exponent (1 / base ^ |exponent|)
        if (exponent < 0) {
            result = 1 / result;
        }

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}*/