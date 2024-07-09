/* Make a simple game involving a computer and a user. The computer first guesses a 
number between 1 and 9 inclusive, then ask the user to enter a number between 1 and 
9 inclusive. If the user guess is correct then display “You got it right”, if the guess is 
close (+1, -1) “Almost got it “, Otherwise “You got it wrong”.*/
package programingassignment3;
import java.util.Scanner;
import java.util.Random;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random ra=new Random();
		//generate a random number bet 1 to 9
		int cg=ra.nextInt(9)+1;
		System.out.println("Enter user number :");
		int ug=sc.nextInt();
		System.out.println("Computer guesses:"+cg);
		if (ug==cg) {
			System.out.println("You got it right");
		}else if (Math.abs(ug-cg)<=1) {
			System.out.println("almost got it");
		}else {
			System.out.println("you got it wrong");
		}
	}
}
