/*Write the methods with the following headers 
    Return the reversal of an integer. Example: reverse (456), returns 654
public static int reverse(int number)
    Return true if number is a palindrome
public static boolean isPalindrome(int number)
 */
package ass6;
import java.util.Scanner;
public class reversemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number :");
		int n=sc.nextInt();
		if (isPalindrome(n)) {
			System.out.println(n + " is a palindrome");
		} else {
        	System.out.println(n + " is not a palindrome");
        }
	}
	public static int r(int x) {
		int r=0;
		while (x!=0) {
			int ld=x%10;
			r=r*10+ld;
			x/=10;
		
	}
		return r;

	}
	public static boolean isPalindrome(int x) {
		return x== r (x);
		
	}

}
