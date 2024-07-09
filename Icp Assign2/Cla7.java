/*Write a java program that takes three positive integer from command line argument and prints true if any one of them is less then or equal to the product of the oyher two and false otherwise. */
package commandline;

public class Cla7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		String s=(a<=b*c) || (b<=a*c) || (c<=a*b)?"true":"false";
		System.out.println(s);

	}

}
