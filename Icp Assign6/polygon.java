/*A regular polygon is an n-sided polygon in which all sides are of the same length and all angles 
have the same degree (i.e., the polygon is both equilateral and equiangular). The formula for 
computing the area of a regular polygon is
Area = 𝑛 × 𝑆^2/4×tan(𝜋/𝑛)
Write a method that returns the area of a regular polygon using the following header:
public static double area(int n, double side)
 */
package ass6;
import java.util.*;
public class polygon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sides of the polygon: ");
        int nos = sc.nextInt();
        //no of sides
        System.out.print("Enter the length of each side of the polygon: ");
        double sl = sc.nextDouble();
        //sidelength
        double polygonArea = area(nos, sl);
        System.out.println("The area of the polygon is: " + polygonArea);
        sc.close();
		
	}
	public static double area(int n,double side) {
		 return (n * side * side) / (4  * Math.tan(Math.PI/n));
	}

}
