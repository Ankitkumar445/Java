/*Write a java program to take an integer input from the user and print the input by removing all 
zeros.  */
package classpractice;
import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();
        int t = n; 
        int rn = 0;
        int m = 1;
        while (n > 0) {
            int d = n % 10;
            if (d != 0) {
                rn += d * m;
                m *= 10;
            }
         n /= 10;
        }
        System.out.println("After removing 0 from number " + t +", the new number is " + rn + ".");
        sc.close();
    }
}