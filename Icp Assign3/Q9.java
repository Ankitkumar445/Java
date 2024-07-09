/*Write a program to input 3 integer number a, b, c. Find the largest number among 3. 
Also find the 2nd largest number among 3. */
package programingassignment3;
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value a,b,c:");
		int a=sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();
		int max=(int)Math.max(a,(Math.max(b, c)));
		System.out.println("largest number :"+max);
		int min=(int)Math.min(a,(Math.min(b, c)));
		System.out.println("second largest number:"+((a+b+c)-(max+min)));

	}

}
