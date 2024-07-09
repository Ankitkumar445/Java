/*WAP to check whether a number is twisted prime or not. Twisted prime is a number if the 
number and its reverse both are prime then it is called twisted prime. */
package ass5;
import java.util.Scanner;
public class Q2 {

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");

	    int x = sc.nextInt();
	       int n=x;
	    for(int i=2; i<=Math.sqrt(x);i++) {
	        if(x%i==0) {
	        	System.out.println("not a twisted prime");
	        	return;
	        }
	    }
	    int sum=0;
	    while (x!=0) {
	        int r=x%10;
	        sum=(sum*10)+r;
	        x=x/10;
	    }
	    for(int j=2; j<=Math.sqrt(sum);j++) {
	        if(sum%j==0) {
	        	System.out.println("not a twisted prime");
	        return;
	        }
	    }
	    System.out.println(n+" is a twisted prime.");
		
	}

}
