/* Write a java program that plays the popular scissor-rock-paper game. (A scissor can cut 
a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program 
randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The 
program prompts the user to enter a number 0, 1, or 2 and displays a message indicating 
whether the user or the computer wins, loses, or draws. */
package firstproject;
import java.util.Scanner;
public class Ha1 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("scissor(0),rock(1),paper(2)");
	int min=0;
	int max=2;
	int pg =(int)(Math.random()*(max-min+1));
	System.out.println("the generated number is "+pg);
	String str ="";
	switch (pg) {
	case 0 : 
		str = "win";
		System.out.println(str);
		break;
	case 1 :
		str = "loose";
		System.out.println(str);
		break;
	case 2 : 
		str = "draw";
		System.out.println(str);
		break;	
	    }
	}
}
