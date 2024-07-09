/*Write a java program to check whether a number is a spy number or not. */
package normalprog;
import java.util.Scanner;
public class spy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number :");
		int x=sc.nextInt();
		int n=x;
		int sum=0;
		int product=1;
		while(n!=0) {
			int i=n%10;
			n=n/10;
			sum+=i;
			product*=i;
		}
		if (sum==product) {
			System.out.println("is a spy number");
		} else {
			System.out.println("is not a spy number");
		}
		

	}

}
