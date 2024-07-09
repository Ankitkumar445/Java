/*Write a java program that gets three integer numbers from the user. Count from the first number 
to the second number increments by the third number. Use for loop to do it. Also, display the 
sum of numbers displayed between the first number and second number. */
package logic;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number :");
		int x=sc.nextInt();
		System.out.print("enter second number :");
		int y=sc.nextInt();
		System.out.print("enter third number :");
		int z=sc.nextInt();
		int sum=0;
		for (int i=x; i<=y; i+=z) {
			System.out.println(i+" ");
			sum +=i;
			
		}
		System.out.println("\nthe sum o the number displayed is"+sum);
		
	}
}
