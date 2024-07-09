/*Write a Java program that takes a year from user and print true if that year is a leap year 
otherwise print false. */
package programingassignment3;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("input the year :");
		int y =sc.nextInt();
		if((y %4==0 && y % 100 !=0)|| (y%400==0)) {
			System.out.println("true");
		}else {
		System.out.println("false");
		}

	}

}
