/*Alice visited SUM hospital to get treatment for her fever and illness. Doctor advised 
her to drink at least 5000 ml of water each day. Alice drank x ml of water today. Write 
a program that print the following message depending on the value of x. */
package programingassignment3;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount of water you drink water today");
		int x=sc.nextInt();
		if (x>=5000) {
			System.out.println("yes, alice is following doctor's advice");
		} 
		else {
			System.out.println("no alice is not following doctor's advice");
		}

	}

}
