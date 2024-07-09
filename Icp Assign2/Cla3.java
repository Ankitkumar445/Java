/*Write a java program that prints the sum of two random integers between 1 and 6(such as you might get when rolling dice). */
package commandline;

public class Cla3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int max =Integer.parseInt(args[0]);
		//int min =Integer.parseInt(args[1]);
		int a=(int)(Math.random()*6)+1;
		int b=(int)(Math.random()*6)+1;
		int sum=a+b;
		System.out.println("sum of "+a+" and "+b+" = "+sum);

	}

}
