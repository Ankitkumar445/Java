/*Some websites impose certain rules for passwords. 
Write a method that checks whether a string is a valid password. Suppose the password rules 
are as follows:
 A password must have at least eight characters.
 A password consists of only letters and digits.
 A password must contain at least two digits. 
Write a program that prompts the user to enter a password and displays Valid Password if the 
rules are followed or Invalid Password otherwise */

package ass6;
import java.util.Scanner;
public class password {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter password :");
		String password=sc.nextLine();
		if(isValidPassword(password)) {
			System.out.println("valid password");
		} else {
			System.out.println("not a valid password");
		}
	}
	public static boolean isValidPassword(String pass) {
		if(pass.length()<8) return false;
		int digitcount=0;
		for (char c : pass.toCharArray()) {
			if(!Character.isLetterOrDigit(c)) return false;
			if(Character.isDigit(c))
				digitcount++;
		}
		return digitcount>=2;
	}
}
