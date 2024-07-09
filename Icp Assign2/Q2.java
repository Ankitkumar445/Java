/*the distance between the two cities (in km)is input through the keyboard.erite a 
java program to convert and print in the distance in meters,feet,inches and centimeters.*/
package la2;
import java.util.Scanner; 
public class Q2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE DISTANCE IN KM :");
		double d=sc.nextDouble();
		double m=d*1000;
		double f=d*3280.8399;
		double i=d*39370.0787;
		double c=d*100000;
		System.out.println(d+"km in meter="+m+"meter");
		System.out.println(d+"km in feet="+f+"feet");
		System.out.println(d+"km in inch="+i+"inch");
		System.out.println(d+"km in centimeter="+c+"centimeter");
		sc.close();
	} 

}
