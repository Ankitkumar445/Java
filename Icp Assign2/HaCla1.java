/*Write a java program to take three inputs from command line argument as principle,rate and time.Find Simple interest. */
package commandline;

public class HaCla1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p=Double.parseDouble(args[0]);
		double r=Double.parseDouble(args[1]);
		double t=Double.parseDouble(args[2]);
		double si=(p*r*t)/100;
		System.out.println("simple interest :"+si);

	}

}
