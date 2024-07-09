/*Write a java program that takes a double value t from the command line and prints the value of cos(5t)+sin(7t).Use Math cos() and Math.sin(). */
package commandline;

public class Cla4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double t=Double.parseDouble(args[0]);
		double result=Math.cos(5*Math.toRadians(t)+Math.sin(7*Math.toRadians(t)));
		System.out.println("Result :"+result);

	}

}
