/*Write a Java program to check if a number is perfect number or not. 
(Hints: A number N is called perfect number, if the sum of factors except N as a factor is 
equals to the number N. */
package logic;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number :");
		int n=sc.nextInt();
		int sof=1;
		for (int i=2; i<=n/2; i++) {
			if (n % i == 0) {
				sof +=i;
				
				}
			}
			if (sof == n) {
				System.out.println(n+"is a perfect square number");
			} else {
				System.out.println(n+"is not a perfent square number");
			}
	}
}

/*int number = scanner.nextInt();

        // Check if the number is a perfect number
        int sum = 1; // Start with 1 because 1 is always a factor

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Output the result
        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        scanner.close();
    }
}*/
