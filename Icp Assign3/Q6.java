/*Write a java program to calculate the monthly electricity bill. The tariff is given as 
follows:
Price per |  unit Unit range
Rs. 3/-   |  First 50 units
Rs. 4.80/-|  50-200 units
Rs. 5.80/-|  200-400 units
Rs. 6.20/-|  Above 400 unit */
package programingassignment3;
import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of units : ");
		int units= sc.nextInt();
		double bill =0.00;
		//
		int temp = 0;
		if (units <= 50)
			bill = bill + 3*units;
		else {
			if (units >50 && units <=200)
				bill = bill + 3*50 + 4.80*(units - 50);
			else if (units >200 && units<=400)
				bill = bill + 3*50 + 4.80*150 + 5.80*(units-200);
			else
				bill = bill + 3*50 + 4.80*150 + 5.80*200 + 6.20*(units-400);
		}
		System.out.println("Your electricity bill is Rupees "+ bill+" /-");
	}

}
