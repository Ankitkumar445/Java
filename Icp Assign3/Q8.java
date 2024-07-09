/* Write a java program that takes the x – y coordinates of a point in the Cartesian plane 
and prints a message telling either an axis on which the point lies or the quadrant in 
which it is found.*/
package programingassignment3;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the x-coordinate:");
		double x=sc.nextDouble();
		System.out.println("enter the y-coordinate");
		double y=sc.nextDouble();
		if (x == 0 && y ==0) {
			System.out.println("("+x+","+y+")is at the origin");
		}else if (x == 0) {
			System.out.println("("+x+","+y+")is at the y axis  ");
		}else if (y == 0) {
			System.out.println("("+x+","+y+")is at the x axis");
		}else {
			if (x > 0 && y > 0) {
				System.out.println("("+x+","+y+")is in quadrant 1");
			}
			else if (x < 0 && y > 0) {
				System.out.println("("+x+","+y+")is in the quadrant 2");
			} 
			else if (x < 0 && y < 0) {
				System.out.println("("+x+","+y+")is in the quadrant 3");
			}
			else if (x > 0 && y < 0) {
				System.out.println("("+x+","+y+")is in the quadrant 4");
			}
		}
	}
}
