/*Write a program that generates a random integer number between 1 to 10 and asks the user to 
guess what the number is. If the user's guess is higher than the random number, the program 
should display "Too high, try again." If the user's guess is lower than the random number, the 
program should display "Too low, try again." The program should use a loop that repeats until 
the user correctly guesses the random number and display good guess.
 */
package logic;
import java.util.Scanner;
public class Q8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("user guess :");
			int u=sc.nextInt();
			int c=(int)(Math.random()*10)+1;
			System.out.println("Computer guess :"+c);
			if(u<c){
				System.out.println("Too low ,try again");
			}else if(u>c){
				System.out.println("Too high,try again");
			}else{
				System.out.println("Good guess");
			}while(u!=c);
		}
	}
}
