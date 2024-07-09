/*Write a java method to check a string is palindrome or not. */
package ass6;
import java.util.Scanner;
public class stringpalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string :");
		String str=sc.next();
		System.out.println("palindrome check :"+checkpalindrome(str));
	}
	public static boolean checkpalindrome(String str) {
		int i =0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
