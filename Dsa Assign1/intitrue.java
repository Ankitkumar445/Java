/*Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
method can't use the multiplication, modulus, or division operators, The method signature is 
as follows.
public static boolean isOdd(int n) */
package normalprog;
import java.util.Scanner;
public class intitrue {
	public static boolean isOdd(int n) {
		return (n & 1) ==1 ;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int x=sc.nextInt();
		System.out.println(x+" is a odd number :"+isOdd(x));

	}

}
