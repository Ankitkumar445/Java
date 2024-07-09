/*Write a program to input the age of a person and check if the age of the person is 
greater than or equal to 18 then print the message: */
package programingassignment3;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int x=sc.nextInt();
		if (x>=18) {
		System.out.println("you are eligible to vote");
		}
		else {
			System.out.println("you are not eligible to vote");
		}
		

	}

}
