/*WAP to calculate and display the factorial of all numbers between m and n (where m < n, m 
> 0, n > 0) */
package ass5;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of m :");
		int a =sc.nextInt();
		System.out.print("Enter the value of n :");
		int b=sc.nextInt();
		int factorial=1;
		for (int i=a; i<=b; i++) {
			System.out.println("factorial of "+i+"is :"+(factorial*=i));
		}
		sc.close();

	}

}
