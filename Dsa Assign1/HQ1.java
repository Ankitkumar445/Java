/*Write a Java program that takes as input three integers, a, b, and c, from the Java console
and determines if they can be used in a correct arithmetic formula (in the given order), like
“a + b = c,” “a = b − c,” or “a b = c.”∗
 */
package normalprog;

import java.util.Scanner;

public class HQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a first number :");
		int a = sc.nextInt();
		System.out.print("enter a second number :");
		int b = sc.nextInt();
		System.out.print("enter a third number :");
		int c = sc.nextInt();
//		if(((a+b)==c) || (a==(b-c)) || (a*b == c) ) {
		if((a+b)==c) {
		System.out.println("correct arithmetic formula "+a+"+"+b+"=="+c);
		}else if(a==(b-c)){
			System.out.println("correct arithmetic formula "+a+"=="+b+"-"+c);
		}else if((a*b )== c){
			System.out.println("correct arithmetic formula "+a+"*"+b+"=="+c);
		}else {
			System.out.println("invalid arithmetic formula ");
		}
	}

}