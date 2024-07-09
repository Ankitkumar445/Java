/*Write a program that finds greatest common divisor (GCD) of two numbers using Euclid's 
algorithm, which is an iterative computation based on the following observation: if y divides 
x, the GCD of x and y is y; otherwise, the GCD of x and y is same as GCD of x % y and y. */
package logic;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the first number :");
		int x=sc.nextInt();
		System.out.print("enter the second number :");
		int y=sc.nextInt();
		while (y !=0){
			int temp=y;
			y=x%y;
			x=temp;
		}
		System.out.println("gcd is "+x);
		

	}

}
