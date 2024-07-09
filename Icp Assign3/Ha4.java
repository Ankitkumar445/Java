/*Write a java program that prompts the user to enter an integer and determines whether 
it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible 
by 5 or 6, but not both.  */
package firstproject;
import java.util.*;
public class Ha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a integer:");
		int x=sc.nextInt();
		System.out.println("Is"+ x + "divisible by 5 and 6?");
		if ((x % 5 == 0) && (x % 6 == 0)) {
			System.out.println("true");
		} else {
		System.out.println("false"); }
		System.out.println("Is"+ x + "divisible by 5 or 6?");
		if ((x % 5 == 0) || (x % 6 == 0)) {
			System.out.println("true");
		} else {
		System.out.println("false"); }
		System.out.println("Is"+ x + "divisible by 5 or 6,but not both?");
		if ((x % 5 == 0) ^ (x % 6 == 0)) {
			System.out.println("true");
		} else {
		System.out.println("false"); }

	}

}
