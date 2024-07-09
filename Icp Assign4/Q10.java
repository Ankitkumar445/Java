/*Write a java program to print largest power of three less than or equal to N.
 */
package classpractice;
import java.util.Scanner;
public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
        int n =sc.nextInt();
		int powerofthree=1;
		while (powerofthree*3<=n) {
			powerofthree *=3;
		}
		System.out.println("the largest power of 3 less tha or equal to"+n+"is"+powerofthree);
		sc.close();


	}

}
