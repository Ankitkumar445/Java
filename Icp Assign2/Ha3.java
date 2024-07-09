/*Write a java program that prompts the user to enter the three points(x1,y1),(x2,y2),(x3,y3) of a triangle and display its area. */
package la2;
import java.util.*;
public class Ha3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the coordinats of first point(x1,y1) :");
		  double x1=sc.nextDouble();
		  double y1=sc.nextDouble();
		  System.out.print("Enter the coordinats of first point(x2,y2) :");
		  double x2=sc.nextDouble();
		  double y2=sc.nextDouble();
		  System.out.print("Enter the coordinats of first point(x3,y3) :");
		  double x3=sc.nextDouble();
		  double y3=sc.nextDouble();
		  double temp=Math.abs((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		  double side1=Math.sqrt(temp);
		  temp=Math.abs((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
		  double side2=Math.sqrt(temp);
		  temp=Math.abs((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		  double side3=Math.sqrt(temp);
		  double s =(side1 +side2+side3)/2;
		  temp=s*(s-side1)*(s-side2)*(s-side3);
		  double area = Math.sqrt(temp);
		  System.out.println("the area of the triangle is"+area);
		  
		  sc.close();


		

	}

}
