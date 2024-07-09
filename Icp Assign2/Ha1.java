/*write a java program that prompts the user to enter the minutes(e.g. 1 billion) and display the number of years
 and days for the minutes.For simplicity,assume a year has 365 days. */
package la2;
import java.util.*;
public class Ha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER OF MINUTES :");
		long minutes=sc.nextLong();
		long years=minutes/(365*24*60);
		int days=(int) ((minutes%(365*24*60))/(24*60));
		System.out.print(minutes + " minutes is approx " + years + " years and " + days + " days.");
		sc.close();
	}

}
