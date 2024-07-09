/* Write a program that reads three integers from the user and prints "Increasing" if the 
numbers are in increasing order, "Decreasing" if the numbers are in decreasing order, 
and "Neither increasing nor decreasing order" otherwise.*/
package programingassignment3;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("input first number");
		int n1=sc.nextInt();
		System.out.println("input second number");
		int n2=sc.nextInt();
		System.out.println("input third number");
		int n3=sc.nextInt();
		if (n1<n2 && n2<n3) {
			System.out.println("increasing");
		}
		else if (n1>n2 && n2>n3) {
			System.out.println("decreasing");
		}
		else {
			System.out.println("neither increasing nor drceasing");
		}

	}

}
