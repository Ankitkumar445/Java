/*WAP to enter the first number and second number. Display the prime numbers between the 
first and second number */
package ass5;
import java.util.Scanner;

public class Q3 {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the first number :");
        int n1 = sc.nextInt();
		System.out.println("Enter the second number :");
		int n2 = sc.nextInt();
		System.out.println("Prime numbers in the range " + n1 + " to " + n2 + " are:");

		for (int i = n1; i <= n2; i++) {
		boolean Prime = true;
		            
		    for (int j = 2; j <= Math.sqrt(i); j++) {
		        if (i % j == 0) {
		            Prime = false;
		            break;
		        }
		    }

		    if (Prime==true) {
		        System.out.println(i + " is a prime number.");
		    }
			sc.close();
		}
   }
}