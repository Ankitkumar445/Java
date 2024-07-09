/*Write a java method to calculate the sum of digits of a given number until the number is a 
single digit. The method signature is as follows.
public static int sum_Of_Digits(int n)
 */
package normalprog;
import java.util.Scanner;
public class singledigitadd {
	public static int sum_Of_Digits(int n) {
		int sum = 0;
		while (n>0){
			sum+=(n%10);
			n/=10;
		}
		if (sum>9) {
			n=sum;
			return sum_Of_Digits(n);
			
		}
		else return sum;
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number :");
		int x=sc.nextInt();
		int s = sum_Of_Digits(x);
		System.out.println(s);
	

	}

}
