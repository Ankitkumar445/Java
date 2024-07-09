/*enter the basic salary of an employee of an organization through the keyboard.His dearness allowance (DA)is 40% of its basic salary,and house rent 
allowance(HRA is 20%) of basic salary.write the java programs to calculate his gross salary.print DA,HRA and Gross salary.  */
package la2;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER BASIC SALARY :");
		Scanner sc=new Scanner(System.in);
		double bs,da,hra,gs;
		bs=sc.nextDouble();
		da=0.4*bs;
		hra=0.2*bs;
		gs=bs+da+hra;
		System.out.println("DA is:"+da);
		System.out.println("HRA is:"+hra);
		System.out.println("GS is:"+gs);
		
		
		sc.close();
		

	}

}
