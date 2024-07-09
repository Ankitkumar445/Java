/*write a java program that reads the radius of a hemisphere and computes the surface area
 and volume using the following formulas:*/ 
package la2;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER RADIUS OF THE HEMISPHERE :");
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		double a=3*Math.PI*r*r;
		double v=(2.0/3)*Math.PI*r*r*r;
		System.out.println("surface area is:"+a);
		System.out.println("volume is:"+v);
		sc.close();

	}

}
