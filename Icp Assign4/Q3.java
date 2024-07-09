/*Write a java program that takes an integer N from user, uses
Math. Random () to print N random integer numbers between 1 to N, and then prints their
average value. Use do while loop. */
package logic;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number :");
		int n=sc.nextInt();
		int sum=n;
		int count=0;
		do {
			int rn =(int) (Math.random()*n)+1;
			System.out.println(rn+" ");
			sum +=rn;
			count++;
		} while(count<=n);
		System.out.println("\n Average of"+n+"random number is "+sum/n);
		
		

	}

}
