/*Write a java program that reads the farenheit degree in a double value 
from the console ,then convert it into celsius and display the result*/
package la2;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A DEGREE FARENHEIT :");
		double f=sc.nextDouble();
		double c=(f-32)*(5.0/9);
		System.out.println(" farenheit is" +f+" celsius is" +c);
		sc.close();
	}
	

}
