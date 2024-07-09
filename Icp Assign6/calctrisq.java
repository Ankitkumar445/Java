/*Write a java program to calculate the area of triangle, square, circle, rectangle by using method 
overloading.
 */
package ass6;
import java.util.Scanner;
public class calctrisq {
	public static double area(double a,double b) {return 0.5*a*b;}
	public static double area(double c) {return Math.PI*c*c;}
	public static int area(int c,int d) {return c*d;}
	public static int area(int a) {return a*a;}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value :");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println("area of the triangle is ="+area(a,b));
		System.out.println("area of the circle is ="+area(a));
		int c=(int)a;
		int d=(int)b;
		System.out.println("area of the rectangle is ="+area(c,d));
		System.out.println("area of square is ="+area(c));
		sc.close();
	}
}
