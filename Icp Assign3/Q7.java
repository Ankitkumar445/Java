/*From the above question no. (6) write a java program with a choice if the consumer 
wants to pay bill online. Consumer who pays their electricity bill online will get a
discount of 3%.
 */
package programingassignment3;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number of units : ");
		int units= sc.nextInt();
		System.out.print("Do you want to pay online(y/n): ");
		char ch = sc.next().charAt(0);
		double bill =0.00;
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
		System.out.println("Total Amount: "+bill);
		if (ch == 'y'|| ch=='Y') {
			double dis = .03*bill;
	        System.out.println("Discount: "+ dis);
	        System.out.println("Amount Payable: "+(bill-dis));
		}
		sc.close();
	}
}
