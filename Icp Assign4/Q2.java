/* An integer n is divisible by 9 if the sum of its digits is divisible by 9. Use this concept in your 
program to determine whether or not the number is divisible by 9. Test it on the following 
numbers: Use while loop.*/
package logic;
import java.util.Scanner;
public class Q2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number :");
		int x=sc.nextInt();
		//int on=x;
		int sum=0;
		while (x !=0) {
			sum +=x%10;
			x/=10;
			
		}
		if (sum % 9 == 0) {
			System.out.println(sum+" is divisible by 9");
		} else {
			System.out.println(sum+" is not divisible by 9");
			
		}
		

	}

}
