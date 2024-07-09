/*Write a java program that takes two positive integers from command line argument and prints the result of first number raise to the power of second number.*/
package commandline;

public class Cla2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[1]);
		int result=(int)Math.pow(a, b);
		System.out.println(a+"raised to the power "+b+" is "+result);

	}

}
